package Management;

import java.io.IOException;
//import java.io.PrintWriter;
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

//import java.sql.*;
/**
 * Servlet implementation class loginreg
 */
@WebServlet("/loginreg")
public class loginreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginreg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//PrintWriter pr=response.getWriter();
	//	pr.println("<h1>hiii</h1>");
	   int flat=Integer.parseInt(request.getParameter("uid"));
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
	          String sql1="insert into login values(?,?,?)"; 
		       PreparedStatement ps1=conn.prepareStatement(sql1);
		       ps1.setInt(1, flat);
		       ps1.setString(2,pass);
		       ps1.setString(3, cpass);
		       ps1.execute();
		       conn.close();
		       RequestDispatcher rs= request.getRequestDispatcher("index.html");
			    rs.forward(request, response);
		}catch(Exception e){
			System.out.println(e);
		}
		  

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	}

}
