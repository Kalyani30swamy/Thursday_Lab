<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>
	<form action="Servlet_page" method="post">
		<label>Enter Your USER ID</label>
		<input type="text" name="u_name" />
		<label>Enter Your Password </label>
		<input type="password" name="u_pass" />
		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form>
</body>
</html>
