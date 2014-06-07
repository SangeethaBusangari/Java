import java.io.*;
import java.sql.*;

class InsertRecord
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		PreparedStatement ps=con.prepareStatement("insert into stud_tab values(?,?,?)");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter roll no");
		int no=Integer.parseInt(br.readLine());
		ps.setInt(1,no);
		System.out.println("enter name");
		String name=br.readLine();
		ps.setString(2,name);

		System.out.println("enter address");
		String address=br.readLine();
		ps.setString(3,address);
		int res;
		res=ps.executeUpdate();
		System.out.println("updated successfully");
		if(res!=0)
			System.out.println("Records is inserted");
		br.close();
		ps.close();
		con.close();
	}
}
/*
E:\JDBC\oracle>java InsertRecord
Driver successfully loaded
enter roll no
2
enter name
mahesh
enter address
peta
updated successfully
Records is inserted

E:\JDBC\oracle>*/
