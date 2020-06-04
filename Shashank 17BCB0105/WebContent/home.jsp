<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Loan Collection</title>
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
h1 {
  text-align: center;
  text-transform: uppercase;
  color: #4CAF50;
}

p {
  text-indent: 50px;
  text-align: justify;
  letter-spacing: 3px;
}
div {
  border: 1px solid gray;
  padding: 8px;
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
  <br>
   <div>
   <h1>
   Home Loan Collection !!
   </h1>
   <p>
   Debt collection process involves pursuing payments of debts that have been owed by individuals or businesses. Debt collection has been prevalent since the early days of banking as it is the chief source of income for banks.
</p><p>
This is an important part of the loan industry and organizations that specialize in debt collection are known as Debt collectors or Collection Agencies. Most collection agencies operate as agents of creditors and collect debts for a fee or percentage of the total amount owed.
   </p>
   </div>
</body>
</html>