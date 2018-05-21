package Management;
import java.sql.*;
public class validate {
/*public static void main(String Args[]){
	checkuser();
}*/
	      public static boolean checkuser(int name,String pass){
		      // boolean st=false;
	    	  //int n;
	    	  String p;
	    	  
		       try{
		   		Class.forName("com.mysql.cj.jdbc.Driver");
		    	// DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
		   		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
		   		
		   		//System.out.println("jjiijj");
		   	/*	String sql="select * from login";
		   		PreparedStatement ps=conn.prepareStatement(sql);
		   		ResultSet rs=ps.executeQuery();
		   		while(rs.next()){
		   				n=Integer.parseInt(rs.getString("username"));
		   			    p=rs.getString("password");
		   			    System.out.println("name="+name+"  n="+n);
		   			     System.out.println("pass="+pass+"  p="+p);
		   			    if((n==name)&&(pass.equals(p)))
		   			    {
		   			    	System.out.println("password  match");
		   			    	return true;
		   			    }
		   			    
		   		}*/
		   		
		   		String sql="select * from login where username="+name;
		   		PreparedStatement ps=conn.prepareStatement(sql);
		   		ResultSet rs=ps.executeQuery();
		   		rs.next();
		         p=rs.getString("password");
		   			  if(pass.equals(p))
		   			    {
		   			    	//System.out.println("password  match");
		   			    	return true;
		   			    }
		   		
		   		
		   		}catch(Exception e){
		   			System.out.println("error in pro"+e);
		   		}
		       
		       return false;


	}

}