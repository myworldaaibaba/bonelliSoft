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
 * Servlet implementation class eventgenerate
 */
@WebServlet("/eventgenerate")
public class eventgenerate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eventgenerate() {
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
		String oname=request.getParameter("oname");
		String ename=request.getParameter("ename");
		String guest=request.getParameter("guest");
		String venue=request.getParameter("venue");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		String amount=request.getParameter("amount");
		String text=request.getParameter("text");
		String name1=request.getParameter("name1");
		String name2=request.getParameter("name2");
		String name3=request.getParameter("name3");
		String name4=request.getParameter("name4");
		int mno1=Integer.parseInt(request.getParameter("mno1"));
		int mno2=Integer.parseInt(request.getParameter("mno2"));
		int mno3=Integer.parseInt(request.getParameter("mno3"));
		int mno4=Integer.parseInt(request.getParameter("mno4"));
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
	    	   String sql1="insert into event values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
		       PreparedStatement ps1=conn.prepareStatement(sql1);
		       ps1.setString(1, oname);
		       ps1.setString(2, ename);
		       ps1.setString(3, guest);
		       ps1.setString(4, venue);
		       ps1.setString(5, date);
		       ps1.setString(6, time);
		       ps1.setString(7, amount);
		       ps1.setString(8, text);
		       ps1.setString(9, name1);
		       ps1.setInt(10, mno1);
		       ps1.setString(11,name2);
		       ps1.setInt(12, mno2);
		       ps1.setString(13, name3);
		       ps1.setInt(14, mno3);
		       ps1.setString(15,name4);
		       ps1.setInt(16, mno4);
		      
		       ps1.execute();
		       conn.close();
		       pr.write("<h1>Event Generate sucessfully</h1>");    
           }catch(Exception e){
			System.out.println(e);
		        }
	 

	}

}
