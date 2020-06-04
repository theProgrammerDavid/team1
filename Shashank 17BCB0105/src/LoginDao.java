

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="select * from managers where name=? and password=?;";
	
	public int check(String name,String password) 
	{
		int i = 0 ;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,name);
			st.setString(2,password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				i = 1;
				//System.out.println("Done");
			}
			else 
			{
				i = 0;
				//System.out.println("Not Done");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
		
	}
}
