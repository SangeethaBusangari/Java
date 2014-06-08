import java.net.*;
import java.io.*;
import java.util.*;
class Details
{
	public static void main(String args[])throws Exception
	{
		URL obj=new URL("http://www.gmail.com/index.html");
		URLConnection conn=obj.openConnection();
		System.out.println("Date:"+ new Date(conn.getDate()));
		System.out.println("Connect-Type:"+conn.getContentType());
		System.out.println("Expiry Date:"+conn.getExpiration());
		System.out.println("Last Modified:"+ new Date(conn.getLastModified()));
		
		int l=conn.getContentLength();
		System.out.println("Length of content"+l);
		if(l==0)
		{
			System.out.println("Content not available");
			return;
		}
		else
		{
			int ch;
			InputStream in=conn.getInputStream();
			while((ch=in.read())!=-1)
			System.out.print((char)ch);
		}
	
		
	}
}
/*
E:\Networking>javac Details.java

E:\Networking>java Details
Date:Thu Jan 01 05:30:00 GMT+05:30 1970
Connect-Type:null
Expiry Date:0
Last Modified:Thu Jan 01 05:30:00 GMT+05:30 1970
Length of content-1*/
