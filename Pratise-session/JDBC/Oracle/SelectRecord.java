import java.io.*;
import java.sql.*;

class SelectRecord
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		PreparedStatement ps=con.prepareStatement("select * from stud_tab where rno=?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter rno for which you want to retreive record");
		int no=Integer.parseInt(br.readLine());
		ps.setInt(1,no);
		ResultSet rs=ps.executeQuery();
		rs.next();
		System.out.println("rno\t"+"name\t"+"address");
		System.out.println("");
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		rs.close();
		ps.close();
		con.close();
	}
}
/*
E:\JDBC\oracle>java SelectRecord
Driver successfully loaded
enter rno for which you want to retreive record
1
rno     name    address

1       SURESH  SANTOSH

E:\JDBC\oracle>*/
