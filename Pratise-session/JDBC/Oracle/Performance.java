import java.io.*;
import java.sql.*;

class Performance
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		System.out.println("connection statement executed");
		long t1=System.currentTimeMillis();
		for(int i=1;i<1000;i++)
		{		
			stmt.executeUpdate("insert into mytab values("+i+","+i+")");
		}
		long t2=System.currentTimeMillis();
		System.out.println("Time taken="+(t2-t1));
		stmt.close();
		con.close();
	}
}
/*
E:\JDBC>javac Performance.java

E:\JDBC>java Performance
Driver successfully loaded
connection statement executed
Time taken=875

E:\JDBC>*/
