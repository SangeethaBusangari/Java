import java.io.*;
import java.sql.*;

class Insertion
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		int res;
		stmt.executeUpdate("insert into studtab values(6,'naveen',89,76,87)");
		stmt.executeUpdate("insert into studtab values(7,'jeevan',89,76,87)");
		stmt.executeUpdate("insert into studtab values(8,'kalpana',89,76,87)");
		stmt.close();
		con.close();
	}
}
/*

E:\JDBC>java Insertion
Driver successfully loaded

E:\JDBC>*/
