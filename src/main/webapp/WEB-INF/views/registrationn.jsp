<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/loginn.css">
</head>
<body style="margin-bottom: 100px">

	<!--Pulling Awesome Font -->

	<div>
		<div class="row">
			<div class="col-md-offset-5 col-md-3">
				<c:url var="addAction" value="adduser"></c:url>
				<form:form action="${addAction}" commandName="userDetails"
					method="post">
					<div class="form-login">
						<h4>Register here.</h4>
						<form:input type="text" path="name" name="name" pattern=".{3,10}"
							title="Minimium length is 3"
							class="form-control input-sm chat-input" placeholder="name" />
						<br>
						<form:input type="text" path="userName" name="username"
							pattern=".{3,10}" required="true" class="form-control input-sm chat-input"
							placeholder="username" title="Minimium length is 3" />
						<br>
						<form:input type="text" path="password" name="password" pattern=".{3,10}"
							class="form-control input-sm chat-input" placeholder="password"
							required="true" />
						<br>
						<form:input type="text" path="mobile" name="mobile" size="10"
							class="form-control input-sm chat-input" placeholder="mobile"
							required="true" title="enter valid mobile number" />
						<br>
						<form:input type="email" path="emailId" name="emailId"
							title="Write valid email" class="form-control input-sm
							chat-input" placeholder="emailId" required="true" />
						<br>
						<div class="wrapper">
							<span class="group-btn">
								<button type="submit" class="btn btn-block btn-primary">Register</button>
							</span>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>