import java.io.*;
class R
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter largest row count");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i+=2)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		for(int i=n-2;i>=1;i-=2)
		{
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}
}
/*
E:\JAVABASICS>javac R.java

E:\JAVABASICS>java R
enter largest row count
9
 *
 ***
 *****
 *******
 *********
 *******
 *****
 ***
 *

E:\JAVABASICS>

*/
