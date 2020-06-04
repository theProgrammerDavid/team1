

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Modify")
public class Modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Modify() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="update reports set amount=? where rid=?;";
	
	public int add(String id,String name) throws Exception
	{
		int i=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
			
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,name);
		st.setString(2,id);
			
		i = st.executeUpdate();
			
		return i;
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 //out.println("Hello");
		String id = request.getParameter("reid");
		String amount = request.getParameter("amnt");
			
			
			try
			{
			int j = add(id,amount);
			//out.println(j);
			if(j==1)
			{
			out.println("Updated Successfully !!");	
			}
			else
			{
				out.println("No Record updated !!");
			}
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
			

		 
	}


}
