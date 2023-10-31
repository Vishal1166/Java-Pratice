package linkcode.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyConnection
{
  private static final String driver="oracle.jdbc.OracleDriver";
  private static final String url="jdbc:oracle:thin:@localhost:1521:XE";
  private static final String userName="System";
  private static final String Password="123456789";
  
  private static Connection con=null; 
	public static Connection getConnection()
	{
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,Password);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	return con;
	}
}
