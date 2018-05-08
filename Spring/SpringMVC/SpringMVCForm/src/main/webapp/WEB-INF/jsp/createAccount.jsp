<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Creation Form</title>
<style>

.error{
	color:red;
	font-size= 15px;
}


</style>
</head>
<body>

<form:form commandName="aNewAccount" method="POST" action="accountCreated">

First Name <form:input path="firstName" name="firstName" type="text" />
<form:errors path="firstName" cssClass="error"/>
<br>

Last Name<form:input path="lastName" name="lastName" type="text"/>
<form:errors path="lastName" cssClass="error"/>

<br>
Age<form:input path="age" name="age" type="text"/>
<form:errors path="age" cssClass="error"/>

<br>

Address <form:input path="address" name="address" type="text"/>
<form:errors path="address" cssClass="error"/>

<br>
Email <form:input path="email" name="email" type="text"/>
<form:errors path="email" cssClass="error"/>

<br>
<input name="submit" type="submit">

</form:form>
</body>
</html>