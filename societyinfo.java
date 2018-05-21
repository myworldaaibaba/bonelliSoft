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
 * Servlet implementation class societyinfo
 */
@WebServlet("/societyinfo")
public class societyinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public societyinfo() {
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
		   		if(n.equals("owner")){
		   			String sql="select * from reg";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Member Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>Wing</th><th style=color:Blue>Flat No</th><th style=color:Blue>First Name</th>");
			   		pr.println("<th style=color:Blue>Middle Name</th><th style=color:Blue>Last Name</th><th style=color:Blue>Mobile No</th><th style=color:Blue>mail</th></tr>");
			   		 while(rs.next()){
			   			String wing=rs.getString("wing");
			   			int fno=Integer.parseInt(rs.getString("fnumber"));
			   	    	String fname=rs.getString("fname");
			   	    	String mname=rs.getString("mname");
			   	    	String lname=rs.getString("lname");
			  	    	int mno=Integer.parseInt(rs.getString("mnumber"));
			  	    	String mail=rs.getString("mail");
			  	    				   	    			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+wing+"</th>");
			   	    	pr.println("<th>"+fno+"</th>");
			   	    	pr.println("<th>"+fname+"</th>");
			   	    	pr.println("<th>"+mname+"</th>");
			   	    	pr.println("<th>"+lname+"</th>");
			   	    	pr.println("<th>"+mno+"</th>");
			   	    	pr.println("<th>"+mail+"</th>");
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		   
		   		}
		   		
		   		else if(n.equals("rent")){
		   			
		   		
		   			String sql="select * from reg where ownership='rental'";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Rental Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>Wing</th><th style=color:Blue>Flat No</th><th style=color:Blue>First Name</th>");
			   		pr.println("<th style=color:Blue>Middle Name</th><th style=color:Blue>Last Name</th><th style=color:Blue>Mobile No</th><th style=color:Blue>mail</th></tr>");
			   		 while(rs.next()){
			   			String wing=rs.getString("wing");
			   			int fno=Integer.parseInt(rs.getString("fnumber"));
			   	    	String fname=rs.getString("fname");
			   	    	String mname=rs.getString("mname");
			   	    	String lname=rs.getString("lname");
			  	    	int mno=Integer.parseInt(rs.getString("mnumber"));
			  	    	String mail=rs.getString("mail");
			  	    				   	    			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+wing+"</th>");
			   	    	pr.println("<th>"+fno+"</th>");
			   	    	pr.println("<th>"+fname+"</th>");
			   	    	pr.println("<th>"+mname+"</th>");
			   	    	pr.println("<th>"+lname+"</th>");
			   	    	pr.println("<th>"+mno+"</th>");
			   	    	pr.println("<th>"+mail+"</th>");
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		   
		   		    
		   		}
		   		
		 }catch(Exception e){
	   			System.out.println("error in pro"+e);
	   		}
		

	}

	
}
