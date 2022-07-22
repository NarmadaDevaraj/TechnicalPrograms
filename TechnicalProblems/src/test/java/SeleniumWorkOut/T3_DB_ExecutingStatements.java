package SeleniumWorkOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class T3_DB_ExecutingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://db4free.net:3306/dbtable";

		Properties connectionProps=new Properties();
		connectionProps.put("user","narmada1812");
		connectionProps.put("password", "Aadhesh@123");
		
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url,connectionProps);
			if(con!=null)
			{
				System.out.println("Established");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Failed to establish");
			e.printStackTrace();
		}
		
		
		
	}

}
