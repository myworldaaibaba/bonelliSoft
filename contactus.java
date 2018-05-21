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
 * Servlet implementation class contactus
 */
@WebServlet("/contactus")
public class contactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contactus() {
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
		   		if(n.equals("admin")){
		   			String sql="select adminno,adminname from contactus";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Admin Info</h3>");
			   		int i=1;
			   	    while(rs.next()){
			   	    	int no=Integer.parseInt(rs.getString("adminno"));
			   	    	String name=rs.getString("adminname");
			   	    	pr.println("<h4>"+ i++ +") "+" "+no+"&nbsp;&nbsp; "+name+"</h4>");
			   	    	}
			   		
		   		}else if(n.equals("supervisor")){
		   			String sql="select superno,supername from contactus";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Supervisor Info</h3>");
			   		int i=1;
			   	    while(rs.next()){
			   	    	int no=Integer.parseInt(rs.getString("superno"));
			   	    	String name=rs.getString("supername");
			   	    	pr.println("<h4>"+ i++ +") "+" "+no+"&nbsp;&nbsp; "+name+"</h4>");
			   	    	}
		   		}else if(n.equals("security")){
		   			String sql="select securityno,secuname from contactus";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Security Info</h3>");
			   		int i=1;
			   	    while(rs.next()){
			   	    	int no=Integer.parseInt(rs.getString("securityno"));
			   	    	String name=rs.getString("secuname");
			   	    	pr.println("<h4>"+ i++ +") "+" "+no+"&nbsp;&nbsp; "+name+"</h4>");
			   	    	}
		   		}else if(n.equals("help")){
		   			String sql="select helpno,helpname from contactus";
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   		pr.println("<h3>Security Info</h3>");
			   		int i=1;
			   	    while(rs.next()){
			   	    	int no=Integer.parseInt(rs.getString("helpno"));
			   	    	String name=rs.getString("helpname");
			   	    	pr.println("<h4>"+ i++ +") "+" "+no+"&nbsp;&nbsp; "+name+"</h4>");
			   	    	}	
		   		}
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
