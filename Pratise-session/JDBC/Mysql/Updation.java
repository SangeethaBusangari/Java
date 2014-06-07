import java.io.*;
import java.sql.*;

class Updation
{
	public static void main(String args[])throws Exception
	{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//System.out.println("Driver successfully loaded");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC?user=admin&password=admin");
		System.out.println("Driver successfully loaded and connection established");

		Statement stmt=con.createStatement();
		int res;
		res=stmt.executeUpdate("update studtab set rno=1 where rno=7");
		System.out.println("no of records updated:"+res);
		System.out.println("pressany key to continue..............");
		System.in.read();
		res=stmt.executeUpdate("delete from studtab where rno=2");
		System.out.println("Records deleted="+res);
		stmt.close();
		con.close();
	}
}
/*
E:\JDBC>java Updation
Driver successfully loaded
no of records updated:3

E:\JDBC>*/
