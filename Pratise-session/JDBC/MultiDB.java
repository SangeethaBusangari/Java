import java.io.*;
import java.util.*;
import java.sql.*;
class DB_Operations
{
	static int count,counter;
	public void oracleOperation()throws Exception
	{ 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully ");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		System.out.println("Connection established successfully");
		Statement stmt=con.createStatement();
		if(count==0)
		{
			stmt.executeUpdate("drop table employe2");
			System.out.println("Table dropped successfully");
			stmt.executeUpdate("create table employe2(eno number(5), name varchar(35),salary number(6))");
			System.out.println("Table created successfully");
			count=1;
			System.out.println("Insert data into table");
			PreparedStatement	ps=con.prepareStatement("insert into employe2 values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Id ");
			int no=Integer.parseInt(br.readLine());
			ps.setInt(1,no);
			System.out.println("Enter Emplyee Name");
			String name=br.readLine();
			ps.setString(2,name);
			System.out.println("Enter Salary");
			String address=br.readLine();
			ps.setString(3,address);
			int res;
			res=ps.executeUpdate();		
			if(res!=0)
			System.out.println("Records are inserted");
			ResultSet rs=stmt.executeQuery("select * from employe2");
			System.out.println();
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			ps.close();
		}  //if
		else if(count==1)
		{
			System.out.println("Table exist in Database");
			System.out.println("Insert data into table");
			PreparedStatement ps1=con.prepareStatement("insert into employe2 values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Id ");
			int no=Integer.parseInt(br.readLine());
			ps1.setInt(1,no);
			System.out.println("Enter Emplyee Name");
			String name=br.readLine();
			ps1.setString(2,name);
			System.out.println("Enter Salary");
			String address=br.readLine();
			ps1.setString(3,address);
			int res;
			res=ps1.executeUpdate();		
			if(res!=0)
			System.out.println("Records are inserted");   
		//stmt.executeUpdate("update employe2 set salary=60000 where salary=30000");
			ResultSet	rs=stmt.executeQuery("select * from employe2");
			System.out.println();
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			ps1.close();
			rs.close();
		}  //else if
		else
		{
			System.out.println("Problem in connecting to database");
		}
		stmt.close();
		con.close();
	}
	public void mysqlOperation()throws Exception
	{
		//char ch;
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB?user=root&password=");
		System.out.println("Driver loaded successfully and connection established");
		Statement stmt=con.createStatement();
		if(counter==0)
		{
			stmt.executeUpdate("drop table employe2");
			System.out.println("Table dropped successfully");
			stmt.executeUpdate("create table employe2(eno int(5), name varchar(35),salary int(6))");
			System.out.println("Table created successfully");
			counter=1;
			System.out.println("Insert data into table");
		//do
		//{
			PreparedStatement ps=con.prepareStatement("insert into employe2 values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Id ");
			int no=Integer.parseInt(br.readLine());
			ps.setInt(1,no);
			System.out.println("Enter Emplyee Name");
			String name=br.readLine();
			ps.setString(2,name);
			System.out.println("Enter Salary");
			String address=br.readLine();
			ps.setString(3,address);
			int res;
			res=ps.executeUpdate();		
			if(res!=0)
			System.out.println("Records are inserted");
			ResultSet	rs=stmt.executeQuery("select * from employe2");
			System.out.println();
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			//System.out.println("Do you want to continue....[press y]");
			//ch=(char)br.read();
		//}while(ch=='y');
			ps.close();
		}  //if
		else if(counter==1)
		{
			System.out.println("Table exist in Database");
			System.out.println("Insert data into table");
			PreparedStatement	ps1=con.prepareStatement("insert into employe2 values(?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Employee Id ");
			int no=Integer.parseInt(br.readLine());
			ps1.setInt(1,no);
			System.out.println("Enter Emplyee Name");
			String name=br.readLine();
			ps1.setString(2,name);
			System.out.println("Enter Salary");
			String address=br.readLine();
			ps1.setString(3,address);
			int res;
			res=ps1.executeUpdate();		
			if(res!=0)
			System.out.println("Records are inserted");
			//stmt.executeUpdate("update employe2 set salary=60000 where salary=30000");
			ResultSet	rs=stmt.executeQuery("select * from employe2");
			System.out.println();
			while(rs.next())
			{
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
			ps1.close();
			rs.close();
		}  //else if
		else
		{
			System.out.println("Problem in connecting to databaseb");
		}
		stmt.close();
		con.close();
	}  //MySQlOperation
}
class MultiDB
{
	public static void main(String args[])throws Exception
	{
		DB_Operations op1=new DB_Operations();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice;
		while(true)
		{
			System.out.println("Welcome to Database Operations\n");
			System.out.println("Select Database\n");
			System.out.println("1.ORACLE");
			System.out.println("2.mysql");
			System.out.println("3.exit");
			System.out.println("enter yout choice:");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: System.out.println("Welcome to ORACLE Database");
						op1.oracleOperation();
						break;
						
				case 2: System.out.println("Welcome to mysql Database");
						op1.mysqlOperation();
						break;
				default:return;
			}  //switch
	System.out.println("Thank you. Visit me again");
		}   //while
	}
}
/*
D:\>javac MultiDB.java

D:\>java MultiDB
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
1
Welcome to ORACLE Database
Driver loaded successfully
Connection established successfully
Table dropped successfully
Table created successfully
Insert data into table
Enter Employee Id
93106
Enter Emplyee Name
sangeetha
Enter Salary
10000
Records are inserted

        93106   sangeetha       10000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
1
Welcome to ORACLE Database
Driver loaded successfully
Connection established successfully
Table exist in Database
Insert data into table
Enter Employee Id
93109
Enter Emplyee Name
Hiranami
Enter Salary
20000
Records are inserted

        93106   sangeetha       10000
        93109   Hiranami        20000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
1
Welcome to ORACLE Database
Driver loaded successfully
Connection established successfully
Table exist in Database
Insert data into table
Enter Employee Id
93107
Enter Emplyee Name
chandra
Enter Salary
20000
Records are inserted

        93106   sangeetha       10000
        93109   Hiranami        20000
        93107   chandra 20000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
2
Welcome to mysql Database
Driver loaded successfully and connection established
Table dropped successfully
Table created successfully
Insert data into table
Enter Employee Id
101
Enter Emplyee Name
Sravanthi
Enter Salary
20000
Records are inserted

        101     Sravanthi       20000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
2
Welcome to mysql Database
Driver loaded successfully and connection established
Table exist in Database
Insert data into table
Enter Employee Id
102
Enter Emplyee Name
Sangeetha
Enter Salary
20000
Records are inserted

        101     Sravanthi       20000
        102     Sangeetha       20000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
2
Welcome to mysql Database
Driver loaded successfully and connection established
Table exist in Database
Insert data into table
Enter Employee Id
103
Enter Emplyee Name
Hiranmai
Enter Salary
10000
Records are inserted

        101     Sravanthi       20000
        102     Sangeetha       20000
        103     Hiranmai	    10000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
2
Welcome to mysql Database
Driver loaded successfully and connection established
Table exist in Database
Insert data into table
Enter Employee Id
104
Enter Emplyee Name
Kiranmai
Enter Salary
12000
Records are inserted

        101     Sravanthi       20000
        102     Sangeetha       20000
        103     Hiranmai	    10000
        104     Kiranmai        12000
Thank you. Visit me again
Welcome to Database Operations

Select Database

1.ORACLE
2.mysql
3.exit
enter yout choice:
3

D:\>*/
