package com.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconnection
{
public static Connection myConnection()
{  
	Connection con=null;
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123456789");
	} 
	catch (ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
	}
	return con;
}
}
