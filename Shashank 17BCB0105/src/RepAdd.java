

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


@WebServlet("/RepAdd")
public class RepAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RepAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
    String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="insert into reports values(?,?,?,?,?);";

	public int add(String id,String name,String type,String amount,String status) throws Exception
	{
		int i=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
			
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,id);
		st.setString(2,name);
		st.setString(3,type);
		st.setString(4,amount);
		st.setString(5,status);
			
		i = st.executeUpdate();
			
		return i;
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		String amount = request.getParameter("amnt");
		String status = request.getParameter("sts");
		
PrintWriter out = response.getWriter();
		
		try
		{
		int j = add(id,name,type,amount,status);
		//out.println(j);
		if(j==1)
		{
		out.println("Report added Successfully !!");	
		//out.println(name + email + mob + username);
		}
		else
		{
			out.println("No report inserted");
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
		
	}
}
