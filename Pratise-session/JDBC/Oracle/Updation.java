import java.io.*;
import java.sql.*;

class Updation
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		int res;
		res=stmt.executeUpdate("update studtab set rno=1 where rno=7");
		System.out.println("no of records updated:"+res);
		stmt.close();
		con.close();
	}
}
/*
E:\JDBC>java Updation
Driver successfully loaded
no of records updated:3

E:\JDBC>*/
