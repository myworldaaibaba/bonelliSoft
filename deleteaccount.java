package Management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteaccount
 */
@WebServlet("/deleteaccount")
public class deleteaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteaccount() {
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
		String uname=(String)session.getAttribute("uname");
		pr.println("user name="+uname);
		 try{
		   		Class.forName("com.mysql.cj.jdbc.Driver");
		  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
		   		String sql="delete from login where username="+uname;
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   	  ps.execute();
			   	
			   	  String sql1="delete from reg where fnumber="+uname;
		   		  PreparedStatement ps1=conn.prepareStatement(sql1);
		   	      ps1.execute(); 
		   	      conn.close();
		   	      
		   	   RequestDispatcher rs= request.getRequestDispatcher("index.html");
				rs.forward(request, response);
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
