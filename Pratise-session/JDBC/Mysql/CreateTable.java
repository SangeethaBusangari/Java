import java.io.*;
import java.sql.*;

class CreateTable
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
		stmt.executeUpdate("create table emp(eno number(2), name varchar(15),salary number(3))");
		stmt.executeUpdate("insert into emp values(3,'naveen',3000)");
		stmt.executeUpdate("insert into emp values(4,'jeevan',4000)");
		stmt.executeUpdate("insert into emp values(5,'kalpana',5000)");
		stmt.executeUpdate("update emp set salary=6000 where salary=3000");
		ResultSet rs=stmt.executeQuery("select * from emp;");
		System.out.println();
		while(rs.next())
		{
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
