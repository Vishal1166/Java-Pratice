import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testconnection 
{
	public static void main(String[] args) 
	{	
		try
		{
			//step-1 Load drive for database
			Class.forName("oracle.jdbc.OracleDriver");
			
			//Step-2 connection to Database
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
			System.out.println("Connection to DB :"+con);
			
			// 3 quation marks(?) -> means 3 column 
			PreparedStatement pt=con.prepareStatement("insert into record values(?,?,?)");
			pt.setInt(1,101);
			pt.setString(2,"vishal");
			pt.setFloat(3,79.76f);			
			int i=pt.executeUpdate();
			if(i>0)
			{
				System.out.println("record saved..");
			}				
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
