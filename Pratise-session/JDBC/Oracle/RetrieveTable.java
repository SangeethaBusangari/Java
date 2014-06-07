import java.io.*;
import java.sql.*;

class RetrieveTable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from studtab");
		System.out.println();
		System.out.println("The result data from Studtab is:");
		while(rs.next())
		{
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getInt(5));
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
/*

E:\JDBC\oracle>java RetrieveTable

The result data from Studtab is:
        1       sangeetha       98      76      97
        1       karuna  98      76      97
        1       karuna  98      76      97
        3       naveen  89      76      87
        4       jeevan  89      76      87
        5       kalpana 89      76      87
        6       naveen  89      76      87
        7       jeevan  89      76      87
        8       kalpana 89      76      87

E:\JDBC\oracle>*/
