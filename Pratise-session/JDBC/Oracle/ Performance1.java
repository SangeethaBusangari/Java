import java.io.*;
import java.sql.*;

class Performance1
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		PreparedStatement ps=con.prepareStatement("insert into mytab values(?,?)");
		long t1=System.currentTimeMillis();
		for(int i=1;i<1000;i++)
		{		
			ps.setInt(1,i);
			ps.setInt(2,i);
			ps.executeUpdate();
		}
		long t2=System.currentTimeMillis();
		System.out.println("Time taken="+(t2-t1));
		stmt.close();
		con.close();
	}
}
/*
E:\JDBC\oracle>java Performance1
Driver successfully loaded
Time taken=407

E:\JDBC\oracle>*/
