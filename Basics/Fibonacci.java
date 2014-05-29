import java.io.*;
class Fibonacci
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter fibonacci sequence range");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a=0,b=1,c;
		System.out.println("Fibonacci series");
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		for(int i=0;i<=n-3;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}
}
/*
E:\JAVABASICS>java Fibonacci
Enter fibonacci sequence range
7
Fibonacci series
0
1
1
2
3
5
8
13

E:\JAVABASICS>		
	*/
		
