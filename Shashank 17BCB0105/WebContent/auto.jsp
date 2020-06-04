<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auto Mobile Loan Collection</title>
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
  <li><a href="aadd.jsp">Add Customer</a></li>
  <li><a href="aview.jsp">View Reports</a></li>
  <li><a href="amod.jsp">Modify Reports</a></li>
  <li><a href="adel.jsp">Delete Customer</a></li>
  <li><a href="Logout">Logout</a></li>
  </ul>
   
   <h1>
   Welcome to Auto Mobile Loan Collection Page !!
   </h1>
   
</body>
</html>