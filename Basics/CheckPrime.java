import java.io.*;
public class CheckPrime
{
	public static void main(String args[])throws IOException
	{
		int flag=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an Integer");
		int x=Integer.parseInt(br.readLine());
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("entered number is a prime number");
		else
			System.out.println("entered number is a composite number");
	}
}
/*
E:\JAVABASICS>javac CheckPrime.java

E:\JAVABASICS>java CheckPrime
enter an Integer
25
entered number is a composite number

E:\JAVABASICS>java CheckPrime
enter an Integer
76
entered number is a composite number

E:\JAVABASICS>java CheckPrime
enter an Integer
11
entered number is a prime number

E:\JAVABASICS>*/
