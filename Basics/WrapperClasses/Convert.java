import java.io.*;
class Convert
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an integer value:\n");
		String str=br.readLine();
		System.out.println("enter string is:"+str);	
		int i=Integer.parseInt(str);
		System.out.println("enter string in decimal:"+str);
		str=Integer.toBinaryString(i);
		System.out.println("enter string in binary:"+str);
		str=Integer.toHexString(i);
		System.out.println("enter string in Hex:"+str);
		str=Integer.toOctalString(i);
		System.out.println("enter string in Octal:"+str);
	}
}
/*
E:\WrapperClasses>javac Convert.java

E:\WrapperClasses>java Convert
enter an integer value:

23
enter string is:23
enter string in decimal:23
enter string in binary:10111
enter string in Hex:17
enter string in Octal:27

E:\WrapperClasses>*/
