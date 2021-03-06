package com.niit.Backend.controller;



import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.dao.ProductDAO;
import com.niit.Backend.dao.UserDetailsDAO;
import com.niit.Backend.model.UserDetails;


@Controller
public class LoginController {
	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	ProductDAO productDAO;

	@Autowired
	UserDetailsDAO userDetailsDAO;
	
	@RequestMapping(value = "login")
	public String DisplayLogin(Model mv) {
		mv.addAttribute("userDetails", new UserDetails());
		mv.addAttribute("IfLoginClicked", "true");
		mv.addAttribute("HideOthers", "true");
		return "index";
	}
		@RequestMapping(value = "Register")
	public String DisplayRegister(Model mv) {

			System.out.println("hi");
		mv.addAttribute("userDetails", new UserDetails());
		mv.addAttribute("categoryList", categoryDAO.list());
		mv.addAttribute("productList", productDAO.list());
		mv.addAttribute("IfRegisterClicked", "true");
		mv.addAttribute("HideOthers", "true");
		return "index";
	}

	@RequestMapping(value = "adduser", method = RequestMethod.POST)
	public String UserRegister(@ModelAttribute("userDetails") UserDetails userDetails, Model mv) {
		userDetails.setEnable("TRUE");
		userDetails.setRole("ROLE_USER");
		userDetailsDAO.saveOrUpdate(userDetails);
		mv.addAttribute("message", "Registration Success");
		return "redirect:/index";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping( value= "/login_session_attributes")
	public String login_session_attributes(HttpSession session)
	{
		System.out.println("hello");
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		UserDetails user = userDetailsDAO.get(username);
		session.setAttribute("userId", user.getUserId());
		session.setAttribute("name", user.getName());
		session.setAttribute("LoggedIn","true");
		
		Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext()
		.getAuthentication().getAuthorities();
		String role="ROLE_USER";
		for(GrantedAuthority authority :authorities)
		{
			if(authority.getAuthority().equals(role))
			{
				session.setAttribute("UserLoggedIn", "true");
			}
			else{
				session.setAttribute("Administrator", "true");
			}
		}
		return "index";
	}

	/*@RequestMapping(value = "loginvalidation", method = RequestMethod.POST)
	public String LoginValidation(@RequestParam("userName") String userName, @RequestParam("password") String password,
			HttpSession session) 
	{
		if(userDetailsDAO.isValidUser(userName, password))
		{
			UserDetails user=userDetailsDAO.get(userName);
			if(user.getAdmin()==0)
			{
				session.setAttribute("userId",user.getUserId());
				session.setAttribute("name",user.getName());
				session.setAttribute("LoggedIn","true");
				session.setAttribute("UserLoggedIn", "true");
				return "Welcome";
			}
			else if (user.getAdmin()==1) {
				session.setAttribute("userId",user.getUserId());
				session.setAttribute("name",user.getName());
				session.setAttribute("LoggedIn","true");
				session.setAttribute("Administrator", "true");
				return "Welcome";
			}
			else
			{
				return "redirect:login";
			}
		}
		else
		{
			return "redirect:login";
		}	
		
		return "Welcome";
	}*/
	
	@RequestMapping(value = "logout")
	public String Logout(HttpServletRequest request,HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}
}

