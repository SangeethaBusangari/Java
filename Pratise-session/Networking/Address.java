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
E:\JAVAprograms\Networking>java Address
enter a website name
www.gmail.com
The IP Address is:www.gmail.com/74.125.236.149

E:\JAVAprograms\Networking>java Address
enter a website name
www.opentext.com
The IP Address is:www.opentext.com/205.211.178.46

E:\JAVAprograms\Networking>java Address
enter a website name
www.google.com
The IP Address is:www.google.com/173.194.36.19

E:\JAVAprograms\Networking>java Address
enter a website name
www.facebook.com
The IP Address is:www.facebook.com/31.13.72.49

E:\JAVAprograms\Networking>*/
