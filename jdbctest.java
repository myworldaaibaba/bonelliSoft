package Management;

import java.sql.*;
//import java.sql.PreparedStatement;

public class jdbctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/managment?autoReconnect=true&useSSL=false", "root", "mysql");
		/*Statement stmt=conn.createStatement();
		String insert="insert into login values(123,'kallu')";
		stmt.executeUpdate(insert);
		String query="select * from login";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()){
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
			
		}*/ 
		String sql="select * from login";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			System.out.println(rs.getString("username"));
			System.out.println(rs.getString("password"));
		}
		}catch(Exception e){
			System.out.println("error in pro"+e);
		}
	}

}
