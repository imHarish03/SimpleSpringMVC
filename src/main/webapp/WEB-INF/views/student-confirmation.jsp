<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student confirmation</title>
</head>
<body>
	The Student is confirmed: ${student.firstName} ${student.lastName}

	<br>
	<br> Country : ${student.country}

	<br>
	<br> Operating system
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>