import java.io.*;
public class Even
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an Integer");
		int n=Integer.parseInt(br.readLine());
		if(n%2==0)
			System.out.println("entered number is even");
		else
			System.out.println("entered number is odd");
	}
}
/*
E:\JAVABASICS>javac Even.java

E:\JAVABASICS>java Even
enter an Integer
4
entered number is even

E:\JAVABASICS>java Even
enter an Integer
6
entered number is even

E:\JAVABASICS>java Even
enter an Integer
3
entered number is odd

E:\JAVABASICS>*/		
