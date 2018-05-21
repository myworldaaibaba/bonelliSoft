package Management;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class complaint
 */
@WebServlet("/complaint")
public class complaint extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public complaint() {
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
	    String name=request.getParameter("name");
		int mnumber=Integer.parseInt(request.getParameter("mnumber"));
		String text=request.getParameter("text");
		java.sql.Timestamp date=new java.sql.Timestamp(new java.util.Date().getTime());
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
	  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
	    	String sql1="insert into complaint values(?,?,?,?,?)"; 
		   PreparedStatement ps1=conn.prepareStatement(sql1);
		   ps1.setTimestamp(1, date);
		       ps1.setString(2, text);
		       ps1.setString(3,flat);
		       ps1.setString(4, name);
		       ps1.setInt(5, mnumber);
		       ps1.execute();
		       conn.close();
		       pr.write("<h1>U R complaint is added</h1>");
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
