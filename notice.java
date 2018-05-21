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
 * Servlet implementation class notice
 */
@WebServlet("/notice")
public class notice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public notice() {
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
		   		if(n.equals("meeting")){
		   			String sql="select * from meeting";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Meeting Information</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style>table, th ,td{border:1px solid black;}");
			   		pr.println("table { border-collapse:collapse;}</style>");
			   		pr.println("</head><body><table style=\"width:100%\">");
			   		pr.println("<tr><th style=color:Blue>Date</th><th style=color:Blue>Time</th><th style=color:Blue>Subject</th>");
			   		pr.println("<th style=color:Blue>OrganisedBy</th><th style=color:Blue>Venue</th></tr>");
			   		 while(rs.next()){
			   	    	String date=rs.getString("dataof");
			   	    	String time=rs.getString("timeof");
			   	    	String sub=rs.getString("sub");
			   	    	String org=rs.getString("orgnise");
			   	    	String venue=rs.getString("venue");
			   	    	
			   	    	pr.println("<br><tr>");
			   	    	pr.println("<th>"+date+"</th>");
			   	    	pr.println("<th>"+time+"</th>");
			   	    	pr.println("<th>"+sub+"</th>");
			   	    	pr.println("<th>"+org+"</th>");
			   	    	pr.println("<th>"+venue+"</th>");
			   	    	
			   	    	pr.println("</tr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		}
		   		
		   		
		   		else if(n.equals("note")){
		   			
		   			String sql="select * from notice where dateof>=CURDATE()";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>General Notice</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style> label{color:navy;font-weight:bold;font-size:17px;margin-right:1px;}");
			   		pr.println("hr{border-width:3px;border-style:inset; }");
			   		pr.println("</style>");
			   		pr.println("</head><body>");
			   	    while(rs.next()){
			   	    	String name=rs.getString("name");
			   	    	String date=rs.getString("dateof");
			   	    	String text=rs.getString("text");
			   	    	
			   	    	pr.println("<br>");
			   	    	pr.println("<br><b><label>From:</label>&nbsp;"+name+"</b>");
			   	    	pr.println("<br><b><label>Date Of Notice:</label>&nbsp;"+date+"</b>");
			   	    	pr.println("<br><b><label>Description:</label>&nbsp;"+text+"</b>");
			   	    	pr.println("<br>");
			   	        pr.println("<hr>");
			   	    }
			   	 pr.println("</table></body></html>");
		   		   
			   	    
		   		}		 }catch(Exception e){
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
