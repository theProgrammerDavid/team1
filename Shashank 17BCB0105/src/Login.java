

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		//PrintWriter out = response.getWriter();
		/*
		LoginDao dao = new LoginDao();
		if(dao.check("seethu","seethu4113"))
		{
			System.out.println("Yes");
		}
		*/
		
		LoginDao dao = new LoginDao();
		
		//if(uname.equals("admin") && pass.equals("admin123"))
	    if(dao.check(uname, pass) == 1)
		{
			HttpSession session = request.getSession();
			session.setAttribute("username",uname);
			
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}
}
