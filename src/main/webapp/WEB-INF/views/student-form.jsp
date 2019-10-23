<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
    	First Name: <form:input path="firstName" />
		<br>
		<br>
    	Last Name : <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"></form:errors>
		<br>
		<br>
		Phone Number : <form:input path="phoneNumber" />
		<form:errors path="phoneNumber" cssClass="error"></form:errors>
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
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		<br>
		
		Favorite Language:
		Java<form:radiobutton path="favouriteLanguage" value="Java" />
		C#<form:radiobutton path="favouriteLanguage" value="C#" />
		<br>
		<br>
		Operating Systems:
			MacOs<form:checkbox path="operatingSystem" value="MacOS" />
		Windows <form:checkbox path="operatingSystem" value="Windows" />
		Linux<form:checkbox path="operatingSystem" value="Linux" />
		<br>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>