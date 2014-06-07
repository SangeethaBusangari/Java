import java.io.*;
import java.sql.*;

class Insertion
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC?user=admin&password=admin");
		System.out.println("Driver successfully loaded and connection established");
		Statement stmt=con.createStatement();
		int res;
		stmt.executeUpdate("insert into studtab values(6,'bindhu',89,76,87)");
		stmt.executeUpdate("insert into studtab values(7,'bhavani',89,76,87)");
		stmt.executeUpdate("insert into studtab values(8,'stella',89,76,87)");
		stmt.close();
		con.close();
	}
}
