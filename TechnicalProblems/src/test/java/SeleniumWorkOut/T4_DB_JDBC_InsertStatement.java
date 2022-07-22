package SeleniumWorkOut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class T4_DB_JDBC_InsertStatement {

	public static String url="jdbc:mysql://db4free.net:3306/dbtable";
	static String userName="narmada1812";
	static String password="Aadhesh@123";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String query="";
		try(Connection con=DriverManager.getConnection(url, userName, password))
		{
//			query="Inset INTO Employee (EmployeeID,FirstName,LastName,AddressLine,email) values (?,?,?,?,?)";
//			
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setInt(1,99);
//			ps.setString(2,"JustTry1");
//			ps.setString(3,"justlast2");
//			ps.setString(4, "Bnag33");
//			ps.setString(5, "empt233y2@gmail.com");
//			ps.executeUpdate();
//			//ps.close();
			
//		Statement s=con.createStatement();
//			ResultSet rs=s.executeQuery("query1");
//			
			System.out.println("Updated");
			Statement s=con.createStatement();
			String query1="SELECT * From Employee orderby EmployeeID;";//Limit n-1,1
			
			ResultSet rs=s.executeQuery(query1);
			
			while(rs.next())
			{
				System.out.println(rs.getStatement());
				System.out.println(rs.getString("FirstName"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
