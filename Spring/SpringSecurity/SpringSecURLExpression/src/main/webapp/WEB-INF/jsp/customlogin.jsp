<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Custom Login JSP</h1>

<p>${message}</p>
<p>${error}</p>
<form action="j_spring_security_check" name="my_form" method="POST">
Username: <input type="text" name="j_username"/>
Password: <input type="password" name="j_password"/>

<input type="submit" name="submit" value="Login"/>
</form>

</body>
</html>