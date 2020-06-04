

import java.sql.*;

public class Db_Connection 
{
	public static void main(String[] args)
	{
		Db_Connection obj = new Db_Connection();
		System.out.println(obj.getConnection());
	}
	public Connection getConnection()
	{
		Connection connection = null;
		//System.out.println("Connection failed");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/loancollection","root","1234");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}

}
