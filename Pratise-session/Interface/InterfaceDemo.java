import java.io.*;
class InterfaceDemo
{
	public static void main(String args[]) throws IOException
	{
		Class c=Class.forName(args[0]);
		MyInter mi=(MyInter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}
