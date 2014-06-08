import java.net.*;
import java.io.*;
class Address
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a website name");
		String site=br.readLine();
		try
		{
			InetAddress ip=InetAddress.getByName(site);
			System.out.println("The IP Address is:"+ip);
		}
		catch(UnknownHostException uhe)
		{
			System.out.println("website Not found");
		}
	}
}
/*
E:\Networking>javac Address.java

E:\Networking>java Address
enter a website name
www.gmail.com
website Not found

E:\Networking>*/
