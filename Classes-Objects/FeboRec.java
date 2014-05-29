import java.io.*;
class fibonacci
{
	int fibo(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
}	
class FeboRec
{
	public static void main(String args[])throws IOException
	{
		int res;
		System.out.println("Enter fibonacci sequence range");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println("Fibonacci series");
		fibonacci f=new fibonacci();
		for(int i=0;i<=n;i++)
		{
			res=f.fibo(i);	
			System.out.println(res);
		}
	}
}
/*
E:\Classes&objects>javac FeboRec.java

E:\Classes&objects>java FeboRec
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

E:\Classes&objects>*/
