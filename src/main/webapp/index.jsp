<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING DATA JSP </title>
</head>
<body>
<h1> SPring data jpa demo</h1>
<hr>
<h2>Employee Management Application</h2>
<hr>
<h3>
<form method="post" action="addEmp">
	
	Emp Id : <input type = "number" name = "eid"><br>
	Name : <input type = "text" name = "name"><br>
	Age : <input type = "number" name = "age"><br>
	Salary : <input type = "number" name = "salary"><br>
	Designation : <input type = "text" name = "desig"><br>
	
	<input type="submit" value= "INSERT">
	<input type = "reset" value= "RESET">
</form>
<hr>
<h3>Search Employee</h3>
<form method = "post" action = "searchEmp">
	Page No: <input type= "number" name = "pageNo"><br>
	Page Size: <input type= "number" name = "pageSize"><br>
	SortBy: <input type= "text" name="sortBy"><br>
	
	<input type="submit" value = "SEARCH">
	
<form>

</body>
</html>