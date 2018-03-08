package test;
import java.sql.*;


public class DBConnect {
	
	public static void main(String[] args){
		
		try {
			
			String hostname = "oracle-instance1.cprjhicmmemt.us-east-2.rds.amazonaws.com";
			String port = "1521";
			String dbName = "ORCL";
			String userName = "admin";
			String password = "password";
			//String jdbcUrl = "jdbc:oracle:thin:@" + hostname + ":" + port + ":" + dbName + "?user=" + userName + "&password=" + password;
			String jdbcUrl = "jdbc:oracle:thin:@oracle-instance1.cprjhicmmemt.us-east-2.rds.amazonaws.com:1521:ORCL";
			Connection con = DriverManager.getConnection(jdbcUrl,userName,password);
			System.out.print("it worked!");
			String sql1 = "SELECT * FROM CUSTOMER";
			PreparedStatement pr = con.prepareStatement(sql1);
			ResultSet set = pr.executeQuery();
			while (set.next())
			{
				String name = set.getString(1);
				String name1 = set.getString(2);
				System.out.print(name);
				System.out.print(name1);
			}
			
			con.close();
			pr.close();
		}
		catch ( SQLException err ) {System.out.println( err.getMessage( ) );} 
		
	}

}
