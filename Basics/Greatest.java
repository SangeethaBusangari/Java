import java.io.*;
import java.lang.String;
public class Greatest
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter Three Integers");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
		int z=Integer.parseInt(br.readLine());
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+ "is the greatest value among other");
			}
			else
			{
				System.out.println(z+ "is the greatest value among other");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println(y+ "is the greatest value among other");
			}
			else
			{
				System.out.println(z+ "is the greatest value among other");
			}
		}
	}
}
/*
E:\JAVABASICS>javac Greatest.java

E:\JAVABASICS>java Greatest
enter Three Integers
56
76
97
97is the greatest value among other

E:\JAVABASICS>java Greatest
enter Three Integers
356
76
87
356is the greatest value among other*/
