package com.niit.Backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart {

	@Id
	@GeneratedValue
	private int id;
	private int userId;
	private String productname;
	private long price;
	private int quantity;
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	private String status;
	
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	
	public String getProductname() {
		return productname;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
