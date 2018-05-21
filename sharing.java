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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sharing
 */
@WebServlet("/sharing")
public class sharing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sharing() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		HttpSession session=request.getSession(false);
		String flat=(String)session.getAttribute("uname");
	
		//String flat=request.getRemoteUser();
		String to=request.getParameter("To");
		String flatno=request.getParameter("flatno");
		String name=request.getParameter("name");
		String text=request.getParameter("text");
		java.sql.Timestamp date=new java.sql.Timestamp(new java.util.Date().getTime());
		java.sql.Timestamp timestamp=new java.sql.Timestamp(date.getTime());
		
	
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
	    	   String sql1="insert into msg values(?,?,?,?,?,?,?)"; 
		       PreparedStatement ps1=conn1.prepareStatement(sql1);
		       ps1.setString(1, to);
		       ps1.setString(2, flat);
		       ps1.setString(3, name);
		       ps1.setString(4, flatno);
		       ps1.setTimestamp(5, date);
		       ps1.setTimestamp(6, timestamp);
		   
		       ps1.setString(7, text);
		       ps1.execute();
		       conn1.close();
		       pr.println("<h2>Msg Send Sucessfully!!!</h2>");
   		
		}catch(Exception e){
   			System.out.println("error in pro"+e);
   		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
