package Management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		int name=Integer.parseInt((request.getParameter("uname")));
		String pass=request.getParameter("pass");
		String id=request.getParameter("uname");
		//System.out.println("uname="+name);
		//System.out.println("pass="+pass);
		
		if(validate.checkuser(name,pass)){
			HttpSession session=request.getSession();
			session.setAttribute("uname", id);
			RequestDispatcher rs= request.getRequestDispatcher("After_member_login.html");
		   rs.forward(request, response);
		}
		else {
			pr.println("<h1>user name or pass word is incorrect</h1>");
			RequestDispatcher rs=request.getRequestDispatcher("index.html");
			rs.include(request, response);
		}
	


	}

}
