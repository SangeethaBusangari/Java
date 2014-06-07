import java.io.*;
import java.sql.*;

class SelectRecord
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ABC?user=admin&password=admin");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from studtab;");
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
