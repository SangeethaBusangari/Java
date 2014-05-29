import java.io.*;
public class Swap
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two Integers");
		double x=Double.parseDouble(br.readLine());
		double y=Double.parseDouble(br.readLine());	
			y=(x+=y)-y;
			x=x-y;
		System.out.println("After Swapping x="+x+"y="+y);
	}
}
/*
E:\JAVABASICS>javac Swap.java

E:\JAVABASICS>java Swap
enter two Integers
5.7
7.4
After Swapping x=7.4y=5.700000000000001

E:\JAVABASICS>*/
