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
</style>

</head>
<body>
<ul>
  <li><a href="hadd.jsp">Add Customer</a></li>
  <li><a href="hview.jsp">View Reports</a></li>
  <li><a href="hmod.jsp">Modify Reports</a></li>
  <li><a href="hdel.jsp">Delete Customer</a></li>
  <li><a href="Logout">Logout</a></li>
  </ul>
  <br>
  <div align="center">
       <form action="Modify">
          Enter report id :<input type="text" name="reid"><br>
          Enter amount : <input type="text" name="amnt"><br>
          <input type="submit" value="Modify" />
       </form>
       
   		<%
   		String id = request.getParameter("rid");
   		String amnt = request.getParameter("amnt");
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/loancollection";
		String username="root";
		String password="1234";
		String query="update reports set amount=? where rid=?;";
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement st = conn.prepareStatement(query);
		
		st.setString(1,amnt);
		st.setString(2,id);
		
		int i = st.executeUpdate();
		
        st.close();
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

