package test;
import java.sql.*;


public class DBConnect {
	
	public static void main(String[] args){
		
		try {
			
			String hostname = "oracle-instance1.cprjhicmmemt.us-east-2.rds.amazonaws.com";
			String port = "1521";
			String dbName = "oracle-instance1";
			String userName = "admin";
			String password = "password";
			String jdbcUrl = "jdbc:oracle:thin//" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
			
			Connection con = DriverManager.getConnection(jdbcUrl);
		}
		catch ( SQLException err ) {System.out.println( err.getMessage( ) );} 
		
		
	}

}
