import java.io.*;
public class SI
{
	public static void main(String args[])throws IOException
	{
		double res=0.0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter principle");
		int p=Integer.parseInt(br.readLine());
		System.out.println("Enter Intrest");
		double r=Double.parseDouble(br.readLine());
		System.out.println("Enter Time");
		double t=Double.parseDouble(br.readLine());
		res=(p*t*r)/100;
		System.out.println("Simple Intrest : "+res);
	}
}
/*
E:\JAVABASICS>javac SI.java

E:\JAVABASICS>java SI
Enter principle
1000
Enter Intrest
3
Enter Time
4
Simple Intrest : 120.0

E:\JAVABASICS>*/
