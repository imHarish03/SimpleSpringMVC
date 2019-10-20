<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
    	First Name: <form:input path="firstName" />
		<br>
		<br>
    	Last Name : <form:input path="lastName" />
		<br>
		<br>
		Country :  <form:select path="country">
			<form:option value="Brazil" label="Brazil" />
			<form:option value="India" label="India" />
			<form:option value="USA" label="USA" />
			<form:option value="Others" label="Others" />
		</form:select>
		<br>
		<br>
		Zone: <form:select path="zone">
			<form:options items="${student.zoneOptions}" />
		</form:select>
		<br>
		<br>
		Favorite Language:
		Java<form:radiobutton path="favouriteLanguage" value="Java" />
		C#<form:radiobutton path="favouriteLanguage" value="C#" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>