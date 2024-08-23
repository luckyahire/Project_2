<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<form action="submitProDetails" method="post">
	<label>Product Id :</label>
	<input type="number" name="id">
	<br>
	<br>
	<label>Product Name :</label>
	<input type="text" name="uname">
	<br>
	<br>
	<label>Product Price :</label>
	<input type="number" name="price">
	<br>
	<br>
	<label>Product Qty :</label>
	<input type="number" name="quantity">
	<br>
	<br>
	<input type="submit" value="submit">
	</form>

	
</body>
</html>
