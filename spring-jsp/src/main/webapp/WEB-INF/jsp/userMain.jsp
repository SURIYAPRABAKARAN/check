<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin-main</title>
</head>
<body>
	User Main
	<form action="">
	<table border="1">
		<tr>
			<th>product name</th>
			<th>product Model</th>
			<th>product price</th>
			<th>Action</th>
		</tr>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<c:forEach items="${productList}" var="viewUsers">
			<tr>
				<td>${viewUsers.productname}</td>
				<td>${viewUsers.productsize}</td>
				<td>${viewUsers.productprice}</td>
				<td> <a href="/buyMappingMethod?pn=${viewUsers.productname}&ps=${viewUsers.productsize}&pp=${viewUsers.productprice}"> Buy </a> </td>
			</tr>
		</c:forEach>
	</table>
	</form>
</body>
</html>