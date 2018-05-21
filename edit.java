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
 * Servlet implementation class edit
 */
@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public edit() {
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
		  		//int uname=2312;
			     String sql="select * from reg where fnumber="+uname;
			   		PreparedStatement ps=conn.prepareStatement(sql);
			   		ResultSet rs=ps.executeQuery();
			   	     while(rs.next()){
			   	    	String wing=rs.getString("wing");
			   	    	String fnumber=rs.getString("fnumber");
			   	    	String fname=rs.getString("fname");
			   	    	String mname=rs.getString("mname");
			   	    	String lname=rs.getString("lname");
			   	    	//String gender=rs.getString("gender");
			   	    	String mno=rs.getString("mnumber");
			   	    	String amno=rs.getString("amnumber");
			   	    	String mail=rs.getString("mail");
			   	    	String familyno=rs.getString("familyno");
			   	    	//String ownership=rs.getString("ownership");
			   	      	pr.println("<html><head>");
			   	      	pr.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"registration.css\"/>");
			   	      	pr.println("<script type=\"text/javascript\" src=\"registration.js\"></script>");
			   	    	pr.println("</head>	<body bgColor=\"lightgrey\"><h1>Registration form	</h1>");
			   	    	pr.println("<form name=\"myForm\" action=\"editsubmit\" method=\"post\" onsubmit=\"return msg()\">");
			   	    	pr.println("<input placeholder=\"Wing No\" type=\"text\" name=\"wing\" id=\"get\" value=\""+wing+"\"><br><br>");
			   	    	pr.println("<input placeholder=\"Flat No\" type=\"number\" name=\"fnumber\" id=\"get\"readonly value=\""+fnumber+"\"><br><br>");
			   	    	pr.println("<input placeholder=\"First Name\"   type=\"text\" name=\"fname\" id=\"get\" value=\""+fname+"\">&nbsp;&nbsp;&nbsp;");
			   	    	pr.println("<input placeholder=\"Middle Name\"  type=\"text\" name=\"mname\" id=\"get\" value=\""+mname+"\">&nbsp;&nbsp;&nbsp;");
			   	    	pr.println("<input placeholder=\"Last Name\"    type=\"text\" name=\"lname\" id=\"get\" value=\""+lname+"\"><br><br>");
			   	    	pr.println("<label>Gender: </label> &nbsp;");
			   	    	pr.println("<label>Male</label><input type=\"radio\" value=\"male\" name=\"gender\">");
			   	    	pr.println("<label>Female</label><input type=\"radio\" value=\"female\" name=\"gender\">");
			   	    	pr.println("<label>Transgender</label><input type=\"radio\" value=\"trans\" name=\"gender\"><br><br>");
			   	    	pr.println("<input placeholder=\"Mobile Number\" type=\"tel\" name=\"mnumber\" id=\"get\" value=\""+mno+"\">&nbsp;&nbsp;&nbsp;");
			   	    	pr.println("<input placeholder=\" Alternative Mobile No\" type=\"tel\" name=\"amnumber\" id=\"get\" value=\""+amno+"\"><br><br>");
			   	    	pr.println("<input placeholder=\"Email-Id\" type=\"email\" name=\"id\" id=\"get\" value=\""+mail+"\"><br><br>");
			   	    	pr.println("<input placeholder=\"No Of family member\" type=\"number\" name=\"familyno\" id=\"get\" value=\""+familyno+"\"><br><br>");
			   	    	pr.println("<label>U R: </label> &nbsp;");
			   	    	pr.println("<label>Owner</label><input type=\"radio\" value=\"owner\" name=\"you\">");
			   	    	pr.println("<label>Rental</label><input type=\"radio\" value=\"rental\" name=\"you\">");
			   	    	pr.println("<br><br>");
			   	    	pr.println("<input type=\"submit\" value=\"submit\" id=\"sub\">");
			   	    	pr.println("</form>");
			   	    	pr.println("</body></html>");
			   	  }
		 } catch(Exception e){
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
