<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Third Party Login</title>
<style> 
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
    <div align="center">
		<h1>Third Party Manager Login Form</h1>
		<form action="Login" >
			<table style="with: 100%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="uname" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>

			</table>
			<br>
			<input class="button1" type="submit" value="Login" />
		</form>
	</div>
</body>
</html>
