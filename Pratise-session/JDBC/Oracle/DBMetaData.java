import java.io.*;
import java.sql.*;

class DBMetaData
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver successfully loaded");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","tiger");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("DB Name="+dbmd.getDatabaseProductName());
		System.out.println("DB Version="+dbmd.getDatabaseProductVersion());
		System.out.println("DB Major Version="+dbmd.getDriverMajorVersion());
		System.out.println("DB Minor Version="+dbmd.getDriverMinorVersion());
		System.out.println("DB Driver Name="+dbmd.getDriverName());
		System.out.println("DB User Name="+dbmd.getUserName());
		System.out.println("============Tables==============");
		String t[]={"TABLE"};
		ResultSet rs=dbmd.getTables(null,null,null,t);
		while(rs.next())
		{
			System.out.println(rs.getString("Table_Name"));
		}
		System.out.println("press any key to continue...");
		System.in.read();
		System.out.println("=============views============");
		String v[]={"VIEW"};
		rs=dbmd.getTables(null,null,null,v);
		while(rs.next())
		{
			System.out.println(rs.getString("Table_Name"));
		}
		rs.close();
		con.close();
	}
}
/*
_DEFTRANDEST
_USER_FILE_GROUPS
_USER_REPL_NESTED_TABLE_NAMES
_utl$_gnp_ind
_utl$_gp_ind_parts
_utl$_lc_ind_subs
_utl$_lnc_ind_parts
AQ$DEF$_AQCALL
AQ$DEF$_AQERROR
AQ$_DEF$_AQCALL_F
AQ$_DEF$_AQERROR_F
MVIEW_EVALUATIONS
MVIEW_EXCEPTIONS
MVIEW_FILTER
MVIEW_FILTERINSTANCE
MVIEW_LOG
MVIEW_RECOMMENDATIONS
MVIEW_WORKLOAD
PRODUCT_PRIVS
PATH_VIEW
RESOURCE_VIEW

E:\JDBC\oracle>*/
