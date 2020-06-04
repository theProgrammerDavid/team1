<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
input[type=text],input[type=password], select {
  width: 100%;
  padding: 8px 12px;
  margin: 8px 0;
  margin-left: 6px;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 15%;
  background-color: #4CAF50;
  color: white;
  padding: 10px 12px;
  margin: 5px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
body
{
background-color: #f2f2f2;
}
</style>
</head>
<body>

<%
     if(session.getAttribute("username") == null)
     {
    	 response.sendRedirect("index.jsp");
     }
   %>
   
  <ul>
  <li><a href="hadd.jsp">Add Customer</a></li>
  <li><a href="hview.jsp">View Reports</a></li>
  <li><a href="reportGen.jsp">Report Generation</a></li>
  <li><a href="hdel.jsp">Delete Customer</a></li>
  <li><a href="Logout">Logout</a></li>
  </ul>
    <div align="center">
		<h1>Add Customer</h1>
		<form action="HAdd" >
			<table style="with: 100%">
			    <tr>
					<td><b>CustomerId</b></td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td><b>FirstName</b></td>
					<td><input type="text" name="uname" /></td>
				</tr>
				<tr>
					<td><b>Email</b></td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td><b>Mobile No</b></td>
					<td><input type="text" name="mob" /></td>
				</tr>
			</table>
			<input type="submit" value="Add" />
		</form>
	</div>
</body>
</html>