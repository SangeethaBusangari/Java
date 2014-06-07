import java.io.*;
import java.sql.*;

class CreateTable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		int res;
		stmt.executeUpdate("create table employee(eno number(2), name varchar(15),salary number(6))");
		stmt.executeUpdate("insert into employee values(3,'naveen',3000)");
		stmt.executeUpdate("insert into employee values(4,'jeevan',4000)");
		stmt.executeUpdate("insert into employee values(5,'kalpana',5000)");
		stmt.executeUpdate("update employee set salary=6000 where salary=3000");
		ResultSet rs=stmt.executeQuery("select * from employee");
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
/*
E:\JDBC\oracle>java CreateTable
Driver successfully loaded

        3       naveen  6000
        4       jeevan  4000
        5       kalpana 5000

E:\JDBC\oracle>*/
