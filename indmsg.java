package Management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class indmsg
 */
@WebServlet("/indmsg")
public class indmsg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indmsg() {
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
			 try{
			   		Class.forName("com.mysql.cj.jdbc.Driver");
			  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
			  		HttpSession session=request.getSession(false);
					String uname=(String)session.getAttribute("uname");
				
			  		String sql="select * from msg where toflatno="+uname;
				   		PreparedStatement ps=conn.prepareStatement(sql);
				   		ResultSet rs=ps.executeQuery();
				   		pr.println("<h3>Message</h3>");
				   		pr.println("<html><head>");
				   		pr.println("<style>table, th ,td{border:1px solid black;}");
				   		pr.println("table { border-collapse:collapse;}</style>");
				   		pr.println("</head><body><table style=\"width:100%\">");
				   		pr.println("<tr><th style=color:Blue>From</th><th style=color:Blue>Name</th><th style=color:Blue>Date</th>");
				   		pr.println("<th style=color:Blue>Time</th><th style=color:Blue>Message</th></tr>");
				   		 while(rs.next()){
				   	    	String fname=rs.getString("frommsg");
				   	    	String mname=rs.getString("name");
				   	    	String lname=rs.getString("dateofmsg");
				   	    	String gender=rs.getString("timeofmsg");
				   	     	String status=rs.getString("text");
				   	    	
				   	    	pr.println("<br><tr>");
				   	    	pr.println("<th>"+fname+"</th>");
				   	    	pr.println("<th>"+mname+"</th>");
				   	    	pr.println("<th>"+lname+"</th>");
				   	    	pr.println("<th>"+gender+"</th>");
				   	    	pr.println("<th>"+status+"</th>");
				   	    	pr.println("</tr>");
				   	    }
				   	 pr.println("</table></body></html>");
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
