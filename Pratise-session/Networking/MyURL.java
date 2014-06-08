import java.net.*;
import java.io.*;
class MyURL
{
	public static void main(String args[])throws IOException
	{
		URL obj=new URL("http://www.gmail.com");
		
		System.out.println("protocol"+obj.getProtocol());
		System.out.println("Host"+obj.getHost());
		System.out.println("File:"+obj.getFile());
		System.out.println("Port:"+obj.getPort());
		System.out.println("Path:"+obj.getPath());
		System.out.println("External form:"+obj.toExternalForm());
	}
	
}
/*
E:\Networking>javac MyURL.java

E:\Networking>java MyURL
protocolhttp
Hostwww.gmail.com
File:
Port:-1
Path:
External form:http://www.gmail.com

E:\Networking>*/
