<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/loginn.css">
</head>
<body style="margin-bottom: 100px">

<!--Pulling Awesome Font -->

<div >
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
        <form action="perform_login" method="post" >
            <div class="form-login">
            <h4>Welcome back.</h4>
            <input type="text" id="username" name="username" required class="form-control input-sm chat-input" placeholder="username" />
            <br>
            <input type="text" id="password" name="password" required class="form-control input-sm chat-input" placeholder="password" />
            <br>
            <div class="wrapper">
            <span class="group-btn">     
                <button type="submit" class="btn btn-block btn-primary">Log in</button>
            </span>
            </div>
            </div>
        </form>
        </div>
    </div>
</div>

</body>
</html>