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

/**
 * Servlet implementation class securityinfo
 */
@WebServlet("/securityinfo")
public class securityinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public securityinfo() {
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
		String n=request.getParameter("param");
		
		 try{
		   		Class.forName("com.mysql.cj.jdbc.Driver");
		  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
		   		if(n.equals("guard")){
		   			String sql="select * from guardinfo";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Security Guard Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>First Name</th><th style=color:Blue>Middle Name</th><th style=color:Blue>Last Name</th>");
			   		pr.println("<th style=color:Blue>Gender</th><th style=color:Blue>Mobile No</th><th style=color:Blue>Alternate No</th><th style=color:Blue>Status</th></tr>");
			   		 while(rs.next()){
			   	    	String fname=rs.getString("fname");
			   	    	String mname=rs.getString("mname");
			   	    	String lname=rs.getString("lname");
			   	    	String gender=rs.getString("gender");
			   	    	int mno=Integer.parseInt(rs.getString("mobileno"));
                        int amno=Integer.parseInt(rs.getString("altmno"));
			   	    	String status=rs.getString("status");
			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+fname+"</th>");
			   	    	pr.println("<th>"+mname+"</th>");
			   	    	pr.println("<th>"+lname+"</th>");
			   	    	pr.println("<th>"+gender+"</th>");
			   	    	pr.println("<th>"+mno+"</th>");
			   	    	pr.println("<th>"+amno+"</th>");
			   	    	pr.println("<th>"+status+"</th>");
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		}
		   		
		   		
		   		else if(n.equals("visitor")){
		   			
		   			String sql="select * from visitor where dateofvisit==CURDATE()";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Visitor Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>Name</th><th style=color:Blue>Gender</th><th style=color:Blue>Mobile No</th>");
			   		pr.println("<th style=color:Blue>In Time</th><th style=color:Blue>Out Time</th><th style=color:Blue>Date(yyyy/mm/dd)</th><th style=color:Blue>Purpose</th></tr>");
			   		 while(rs.next()){
			   	    	String fname=rs.getString("name");
			   	    	String gender=rs.getString("gender");
			   	    	int mno=Integer.parseInt(rs.getString("mobileno"));
			   	    	String intime=rs.getString("intime");
			   	    	String outtime=rs.getString("outtime");
			   	    	String date=rs.getString("dateofvisit");
			   	    	String status=rs.getString("purpose");
			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+fname+"</th>");
			   	    	pr.println("<th>"+gender+"</th>");
			   	    	pr.println("<th>"+mno+"</th>");
			   	    	pr.println("<th>"+intime+"</th>");
			   	    	pr.println("<th>"+outtime+"</th>");
			   	    	pr.println("<th>"+date+"</th>");
			   	    	pr.println("<th>"+status+"</th>");
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		   
			   	    
		   		}else if(n.equals("guest")){
		   			String sql="select * from guest";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Guest Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>Name</th><th style=color:Blue>Gender</th><th style=color:Blue>In Time</th>");
			   		pr.println("<th style=color:Blue>Out Time</th><th style=color:Blue>Date</th><th style=color:Blue>Purpose</th><th style=color:Blue>InvitedBy</th></tr>");
			   		 while(rs.next()){
			   	    	String fname=rs.getString("name");
			   	    	String gender=rs.getString("gender");
			   	    	String intime=rs.getString("intime");
			   	    	String outtime=rs.getString("outtime");
			   	    	String date=rs.getString("dateofvisit");
			   	    	String status=rs.getString("purpose");
			   	    	String invite=rs.getString("invitedby");
			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+fname+"</th>");
			   	    	pr.println("<th>"+gender+"</th>");
			   	    	pr.println("<th>"+intime+"</th>");
			   	    	pr.println("<th>"+outtime+"</th>");
			   	    	pr.println("<th>"+date+"</th>");
			   	    	pr.println("<th>"+status+"</th>");
			   	    	pr.println("<th>"+invite+"</th>");
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		   
			
		   		}
		 }catch(Exception e){
	   			System.out.println("error in pro"+e);
	   		}
		
	}

}
