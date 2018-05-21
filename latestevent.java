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
 * Servlet implementation class latestevent
 */
@WebServlet("/latestevent")
public class latestevent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public latestevent() {
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
		   		String sql="select * from event where (dateof>=CURDATE()) AND (dateof<=CURDATE()+INTERVAL 29 DAY)order by dateof;";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Upcomming Event Info</h3>");
			   		pr.println("<html><head>");
			   		pr.println("<style> label{color:navy;font-weight:bold;font-size:20px;width:180px;padding-right:7px;}");
			   		pr.println("b{display:block;margin-bottom:0; font-size:19px;}");
			   		pr.println("p{font-weight:bold;margin:0;padding:0 ;font-size:19px; }");
			   		pr.println("hr{border-width:3px;border-style:inset; }");
					pr.println("</style>");
			   		pr.println("</head><body>");
			   	    while(rs.next()){
			   	    	String oname=rs.getString("eorgniser");
			   	    	String ename=rs.getString("ename");
			   	    	String guest=rs.getString("guestname");
			   	    	String vanue=rs.getString("venue");
			   	    	String dateof=rs.getString("dateof");
			   	    	String timeof=rs.getString("timeof");
			   	    	String edesc=rs.getString("edesc");
			   	    	String name1=rs.getString("name1");
			   	    	String name2=rs.getString("name2");
			   	    	String name3=rs.getString("name3");
			   	    	String name4=rs.getString("name4");
			   	    	String mno1=rs.getString("mno1");
			   	    	String mno2=rs.getString("mno2");
			   	    	String mno3=rs.getString("mno3");
			   	    	String mno4=rs.getString("mno4");
			   	    	
			   	    	pr.println("<br>");
			   	    	pr.println("<br><b><label>Date Of Event:</label>&nbsp;"+dateof);
			   	    	pr.println("&nbsp;&nbsp;&nbsp;<label>Time Of Event: </label>&nbsp;"+timeof+"</b>");
			   	        pr.println("<br><b><label>Event organiser name: </label>&nbsp;"+oname+"</b>");
			   	    	pr.println("<br><b><label>Event Name: </label>&nbsp;"+ename+"</b>");
			   	    	pr.println("<br><b><label >Guest Name: </label>&nbsp;"+guest+"</b>");
			   	    	pr.println("<br><b><label>Venue: </label>&nbsp;"+vanue+"</b>");
			   	    	pr.println("<br><b><label>about event: </label>&nbsp;"+edesc+"</b>");
			   	    	pr.println("<br><b><label>Co-ordinater Number:</label></b>");
				   	    pr.println("<br><p><label>1 </label>&nbsp;"+name1);
			   	    	pr.println("&nbsp;&nbsp;<label></label>&nbsp;"+mno1);
			   	    	pr.println("<br><label>2 </label>&nbsp;"+name2);
			   	    	pr.println("&nbsp;&nbsp;<label></label>&nbsp;"+mno2);
			   	    	pr.println("<br><label>3 </label>&nbsp;"+name3);
			   	    	pr.println("&nbsp;&nbsp;<label></label>&nbsp;"+mno3);
			   	    	pr.println("<br><label>4 </label>&nbsp;"+name4);
			   	    	pr.println("&nbsp;&nbsp;<label></label>&nbsp;"+mno4+"</p>");
			   	        pr.println("<br><br>");		   	    
			   	    pr.println("<hr>");
			   	   
			   	    }
			   	    pr.println("end");
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
