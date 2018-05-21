package Management;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class registration
 */
@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter pr=response.getWriter();
	String wing=request.getParameter("wing");
	String flat=request.getParameter("fnumber");
	String fname=request.getParameter("fname");
	String mname=request.getParameter("mname");
	String lname=request.getParameter("lname");
	String gender=request.getParameter("gender");
	int mnumber=Integer.parseInt(request.getParameter("mnumber"));
	int amnumber=Integer.parseInt(request.getParameter("amnumber"));
	String mail=request.getParameter("id");
	int familyno=Integer.parseInt(request.getParameter("familyno"));
	String you=request.getParameter("you");
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
  		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
       String sql="select * from reg where fnumber="+flat;
       PreparedStatement ps=conn.prepareStatement(sql);
       ResultSet rs=ps.executeQuery();
       if(!rs.isBeforeFirst())
       {
    	   String sql1="insert into reg values(?,?,?,?,?,?,?,?,?,?,?)"; 
	       PreparedStatement ps1=conn.prepareStatement(sql1);
	       ps1.setString(1, wing);
	       ps1.setString(2, flat);
	       ps1.setString(3, fname);
	       ps1.setString(4, mname);
	       ps1.setString(5, lname);
	       ps1.setString(6, gender);
	       ps1.setInt(7, mnumber);
	       ps1.setInt(8, amnumber);
	       ps1.setString(9, mail);
	       ps1.setInt(10, familyno);
	       ps1.setString(11, you);
	       ps1.execute();
	       conn.close();
	       pr.write("data added sucessfully");
	       pr.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"registration.css\"/>");
	       pr.println("<html><head><script type=\"text/javascript\" src=\"password.js\">");
           pr.println("</script></head>");
	       pr.println("<body><h1>user name password info</h1><br>");
           pr.println("<form  name=\"myForm\"  action=\"loginreg\" method=\"get\" onsubmit=\" return password()\">");
	       pr.println("user name :<input type=\"text\" name=\"uid\" id=\"get\"  readonly value=\""+flat+"\">");
	       pr.println("<br><br>");
	       pr.println("password:&nbsp;<input type=\"password\" name=\"pass\" id=\"get\"><br>");
	       pr.println("<br> confirm password:&nbsp;<input type=\"password\"  name=\"cpass\" id=\"get\"><br><br>");
	       pr.println("<input type=\"submit\" value=\"submit\" id=\"sub\">");
	   	

           
        }
       else{
    	   
    	   pr.println("<script type=\"text/javascript\">");
    	   pr.println("alert('flat no alread exist');");
    	   pr.println("location='registration.html';");
    	   pr.println("</script>");
    	   
    	    }
     
	}catch(Exception e){
		System.out.println(e);
	}
 
	
 
 

	
	}
}
