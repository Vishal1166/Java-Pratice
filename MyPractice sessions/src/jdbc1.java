import java.sql.*;
import java.util.Scanner;
public class jdbc1
{

	public static void main(String[] args) 
	{
			Connection con=null;
			PreparedStatement pt=null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
			System.out.println("connection success..."+con);
		} catch (SQLException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		//-------------------------------------------------------------------------------------------
		Scanner sc=new Scanner(System.in);
		int i=0,ch=0;		
		do
		{
			System.out.println("1-insert\n2-Delete\n3-Update\n4-display record\n5-display table");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			if(ch==1)
			{			
				System.out.println("Enter id, name, perct");				
				try {
					 pt=con.prepareStatement("insert into test1 values(?,?,?)");
					pt.setInt(1,sc.nextInt());
					pt.setString(2,sc.next());
					pt.setFloat(3,sc.nextFloat());
					i=pt.executeUpdate();
					if(i>0)
					{
						System.out.println("record inserted");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				else if(ch==2)
				{
					System.out.println("Enter id to delete record");
					try {
						 pt=con.prepareStatement("delete from test1 where id=?");
						pt.setInt(1,sc.nextInt());
						i=pt.executeUpdate();
						if(i>0)
						{
							System.out.println("Record deleted...");
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else if(ch==3)
				{
					System.out.println("enter id and new percentage to update record ");
					try {
						 pt=con.prepareStatement("update test1 set perct=? where id=?");
						pt.setInt(2,sc.nextInt());						
						pt.setFloat(1,sc.nextFloat());
						
						i=pt.executeUpdate();
						if(i>0)
						{
							System.out.println("record updated....");
						}
					} 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}	
				else if(ch==4)
				{
					System.out.println("enter id to display record");
					try {
						pt=con.prepareStatement("select * from test1 where id=?");
						pt.setInt(1,sc.nextInt());
						ResultSet rs=pt.executeQuery();
						if(rs.next())				
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));					
						else						
							System.out.println("record not fount");						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
				}
				else if(ch==5)
				{
					String str= "select * from test1";
					try {
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery(str);
						System.out.println("id\t Name \t percentage ");
						System.out.println("------------------------------------------------------");
						while(rs.next())
						{							
							System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		   System.out.println("Do you want to continue press yes/no :");	
		}while(sc.next().equals("yes"));	
		System.out.println("------------------Thank you-----------------------");		
	}	   
}
