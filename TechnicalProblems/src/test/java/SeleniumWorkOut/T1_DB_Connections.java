package SeleniumWorkOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class T1_DB_Connections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		connectwithMysqlDb();
	}

	public static Connection connect(String url)
	{
		try {
			Connection conn=DriverManager.getConnection(url,"narmada1812","Aadhesh@123");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public static void connectwithMysqlDb()
	{
		
		try {
			String url="jdbc:mysql://db4free.net:3306/dbtable";
			Connection conn=connect(url);
			Statement smt=conn.createStatement();
			String query="SELECT DISTINCT EmployeeID FROM Employee ORDER BY EmployeeID DESC Limit 1,1;";//Limit n-1,1
			ResultSet rs=smt.executeQuery(query);
			
			while(rs.next())
			{
//				System.out.println(rs.getString("Email"));
//				System.out.println(rs.getString("AddressLine"));
//				System.out.println(rs.getString("City"));
				//System.out.println(rs.getInt(1));
				System.out.println(rs.getInt("EmployeeID"));
				//System.out.println(rs.getString("FirstName"));
				//int id=rs.getInt("EmployeeID");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
