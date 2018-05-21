package Management;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		pr.println("<h1>hi kalpana this is u r first servlet pro with post method</h1>");
		
		pr.println("<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\"/>");
		pr.println("<style> input{margin-left:50%;}	</style>");
		pr.println("<script type=\"text/javascript\" src=\"delete.js\"></script>");
		pr.println("</head><body>");
		pr.println("<form name=\"myForm\" action=\"notice\" method=\"get\" onsubmit=\" return add()\">");
		pr.println("<input type=\"submit\" value=\"proceed\" id=\"sub\">");
		pr.println("</form></body></html>");
	
	}

}
