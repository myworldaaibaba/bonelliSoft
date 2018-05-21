package Management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class editsubmit
 */
@WebServlet("/editsubmit")
public class editsubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editsubmit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		String wing=request.getParameter("wing");
		String flat=request.getParameter("fnumber");
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String gender=request.getParameter("gender");
		int mnumber=Integer.parseInt(request.getParameter("mnumber"));
		int amnumber=Integer.parseInt(request.getParameter("amnumber"));
		String mail=request.getParameter("id");
		int familyno=Integer.parseInt(request.getParameter("familyno"));
		String you=request.getParameter("you");
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
	    	   String sql1="update reg set wing=?,fname=?,mname=?,lname=?,gender=?,mnumber=?,amnumber=?,mail=?,"
	    	   		+ "familyno=?,ownership=? where fnumber="+flat; 
		       PreparedStatement ps1=conn.prepareStatement(sql1);
		       ps1.setString(1, wing);
		       ps1.setString(2, fname);
		       ps1.setString(3, mname);
		       ps1.setString(4, lname);
		       ps1.setString(5, gender);
		       ps1.setInt(6, mnumber);
		       ps1.setInt(7, amnumber);
		       ps1.setString(8, mail);
		       ps1.setInt(9, familyno);
		       ps1.setString(10, you);
		       ps1.execute();
		       conn.close();
		       pr.write("<h1>data Edited sucessfully</h1>");      
	     
		}catch(Exception e){
			System.out.println(e);
		}
	 
		
	 
	 

		

	}

}
