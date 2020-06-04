<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Reports</title>
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
th {
  background-color: #4CAF50;
  color: white;
}
table,th,td {
   border: 1px solid black;
   border-collapse: collapse;
}
th, td {
  padding: 15px;
  text-align: left;
}
input[type=text],input[type=password], select {
  width: 30%;
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
  margin-left: 5px;
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
<ul>
  <li><a href="hadd.jsp">Add Customer</a></li>
  <li><a href="hview.jsp">View Reports</a></li>
  <li><a href="reportGen.jsp">Report Generation</a></li>>
  <li><a href="hdel.jsp">Delete Customer</a></li>
  <li><a href="Logout">Logout</a></li>
  </ul>
  <br>
   <div align="center">
       Report_ID : <input type="text" name="search" /><input type="submit" value="Go">
       <br><br>
       <table style="with: 100%">
				<tr>
					<th>R_ID</th>
					<th>Name</th>
					<th>Type</th>
					<th>Amount</th>
					<th>Status</th>
					<th>Modify/Delete</th>
				</tr>
				<%
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/loancollection";
		String username="root";
		String password="1234";
		String query="select * from reports";
		Connection conn=DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
		%>
				<tr>
					<td><%= rs.getInt("rid") %></td>
					<td><%=rs.getString("name") %></td>
					<td><%=rs.getString("type") %></td>
					<td><%=rs.getInt("amount") %></td>
					<td><%= rs.getString("status") %></td>
					<td><a href="modify.jsp"><input type="button" value="Modify"></a><input type="button" value="Delete"></td>
				</tr>
		<%
		}
		%>		
		</table>
		<br><br>
		<%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }
				%>

   </div>
</body>
</html>

