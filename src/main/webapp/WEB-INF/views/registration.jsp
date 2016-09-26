 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registration</title>

<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="<c:url value="/resources/css/w3.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css" />" rel="stylesheet">
</head>
<body>
<pre>
<c:url var="addAction" value="adduser"></c:url>
<form:form action="${addAction}" commandName="userDetails" method="post">
<form:label path="name"><spring:message text="Name" /></form:label><form:input path="name" required="true" title="minimum length for name is 5"/>
<form:label path="userName"><spring:message text="UserName" /></form:label><form:input path="userName" required="true" title="minimum length for username is 5" />
<form:label path="password"><spring:message text="Password" /></form:label><form:input path="password" required="true" />
<form:label path="mobile"><spring:message text="Mobile Number" /></form:label><form:input path="mobile" required="true" title="enter valid mobile number" />
<form:label path="emailId"><spring:message text="emailId" /></form:label><form:input path="emailId" required="true" />
<input type="submit" value="signup"/>
</form:form>
</pre>


</body>
</html> 

