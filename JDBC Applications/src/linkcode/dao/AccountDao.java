package linkcode.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import linkcode.model.Account;

public class AccountDao implements AccountInterface {
   private int i=0;
    Connection con=null;
    PreparedStatement pt=null;
	@Override
	public int create(Account accobj) {
	     con=MyConnection.getConnection();
	try {
		  pt=con.prepareStatement("insert into Account values(?,?,?)");
		  pt.setInt(1,accobj.getAccno());
		  pt.setString(2,accobj.getCustname());
		  pt.setDouble(3,accobj.getAccbal());
		  i=pt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	  
		return i;
	}
	@Override
	public LinkedList<Account> Search(int ano)
	{
		con=MyConnection.getConnection();
		LinkedList<Account> lst=null;
		try {
			pt=con.prepareStatement("select * from Account where accno=?");
			pt.setInt(1,ano);
			ResultSet rs=pt.executeQuery();
			 lst=new LinkedList<Account>();
				if(rs.next())
				{
					Account a=new Account();
				a.setAccno(rs.getInt(1));
				a.setCustname(rs.getString(2));
				a.setAccbal(rs.getDouble(3));
				lst.add(a);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
	@Override
	public int update(Account a) {
		con=MyConnection.getConnection();

        try {
			pt=con.prepareStatement("update Account set accbal=? where accno=?");
			pt.setInt(2,a.getAccno());		
			pt.setDouble(1,a.getAccbal());
			
			i=pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public int delete(int ano) {
		con=MyConnection.getConnection();
		try {
			pt=con.prepareStatement("delete from Account where accno=?" );
			pt.setInt(1,ano);
			i=pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public List<Account> DisplayAll()
	{
		con=MyConnection.getConnection();
		LinkedList<Account> lst=null;
		
		String str="select * from Account";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(str);
			
			 lst=new LinkedList<Account>();
			 System.out.println("ACCNO\tCUSTNAME   ACCBAL");
			while(rs.next())
			{
				Account a=new Account();
			a.setAccno(rs.getInt(1));
			a.setCustname(rs.getString(2));
			a.setAccbal(rs.getDouble(3));
			lst.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}
}
