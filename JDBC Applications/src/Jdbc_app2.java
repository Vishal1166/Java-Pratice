
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc_app2
{
	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pt=null;
		try {
			//step-1 Load driver for database
			Class.forName("oracle.jdbc.OracleDriver");
			
			//Step-2 connection to Database
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
			System.out.println("Connection to database.. ");			
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//------------------------------------------------------------------------------------
		Scanner sc=new Scanner(System.in);
		int i=0,ch=0;
		int sid=0;
		String sname=null;
		float perct=0;
		
		do
		{
			System.out.println("1-Insert\n2-Delete\n3-Update\n4-Search\n5-Display All");
			System.out.println("enter your choicde :");
			ch=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter student rollno, Name, Perct");
				sid=sc.nextInt();
				sname=sc.next();
				perct=sc.nextFloat();
				try {
					pt=con.prepareStatement("insert into student values(?,?,?)");
					pt.setInt(1, sid);
					pt.setString(2, sname);
					pt.setFloat(3, perct);
					i=pt.executeUpdate();
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				if(i>0)
				{
					System.out.println("record inserted...");
				}				
			}
			else if(ch==2)
			{
				System.out.println("Enter roll no to delete record");
				try {
					pt=con.prepareStatement("delete from student where rno=?");
					pt.setInt(1,sc.nextInt());
					i=pt.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(i>0)
				{
					System.out.println("record deleted..");
				}			
			}
			else if(ch==3)
			{
				System.out.println("Enter rno for update student perct");
				perct=sc.nextFloat();
				sid=sc.nextInt();
				try {
					pt=con.prepareStatement("update student set perct=? where rno=?");
					pt.setFloat(1, perct);
					pt.setInt(2, sid);
					i=pt.executeUpdate();   //dml -> insert , delete , update 
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				if(i>0)
				{
					System.out.println("record updated...");
				}
			}	
			else if(ch==4)
			{
				System.out.println("Enter roll no for search record");
				try {
					pt=con.prepareStatement("select * from student where rno=?");
					pt.setInt(1,sc.nextInt());
					ResultSet rs=pt.executeQuery();  //select    
					if(rs.next())
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
					else
						System.out.println("record not found...");
				} 
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
			else if(ch==5)
			{
				String str="select * from student";
					try {
						Statement st=con.createStatement();					
                           //cursor
						ResultSet rs=st.executeQuery(str);  //select 
						ResultSetMetaData rmd=rs.getMetaData();   // data about date   
						System.out.println("---------------------------------------\n");
						for(i=1;i<=rmd.getColumnCount();i++)
						{
							System.out.print(rmd.getColumnName(i)+"\t");
						}
						System.out.println("\n---------------------------------------\n");
						while(rs.next())
						{
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
						}
					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}				    
			}
			System.out.println("Do you want continue press yes/no : ");
		}while(sc.next().equals("yes"));
		System.out.println("-------------------Thank You--------------------------");
	}
}
