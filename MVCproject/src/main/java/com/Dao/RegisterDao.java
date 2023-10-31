package com.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.Model.Login;
import com.Model.Register;

public class RegisterDao 
{   
	Connection con=null;
	PreparedStatement pt=null;
	int i=0;
	public boolean validetuser(Login obj)
	{
		boolean b=false;
		con=Myconnection.myConnection();
		try {
			pt=con.prepareStatement("select * from bank where username=? and password=?");
			pt.setString(1,obj.getUname());
			pt.setString(2, obj.getPass());
			ResultSet rs=pt.executeQuery();
			if(rs.next())
			{
				b=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}
	public int savedata(Register reg)
	{
		con=Myconnection.myConnection();
			 try {
				pt=con.prepareStatement("insert into bank values(?,?,?,?,?,?)");
				pt.setInt(1,reg.getRegno());
				pt.setString(2,reg.getFname());
				pt.setString(3,reg.getMob());
				pt.setString(4,reg.getUname());
				pt.setString(5,reg.getPass());
				pt.setFloat(6,reg.getAmount());
				 i =pt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return i;
	}
	public List<Register> Search(int rno)
	{
		Register r=null;
		con=Myconnection.myConnection();
		LinkedList<Register> lst=new LinkedList<>();
		ResultSet rs=null;
		try {
			pt=con.prepareStatement("select * from bank where regno=?");
		    	pt.setInt(1,rno);
		        rs=pt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}		    
				try {
					if(rs.next())
					{
					r =new Register();
					r.setRegno(rs.getInt(1));
					r.setFname(rs.getString(2));
					r.setMob(rs.getString(3));
					r.setAmount(rs.getFloat(6));
					lst.add(r);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}		
		return lst;	
	}
	public List<Register> DisplayAll()
	{
		Register r=null;
		con=Myconnection.myConnection();
		LinkedList<Register> lst=new LinkedList<>();
		ResultSet rs=null;
		 Statement pstast=null;
				try 
				{
					pstast=con.createStatement();
					rs=pstast.executeQuery("select * from bank");
				while(rs.next())
					{
					r =new Register();
					r.setRegno(rs.getInt(1));
					r.setFname(rs.getString(2));
					r.setMob(rs.getString(3));
					r.setAmount(rs.getFloat(6));
					lst.add(r);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}		
		return lst;	
	}
}
