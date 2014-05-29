import java.io.*;
public class PrimeGen
{
	public static void main(String args[])throws IOException
	{
		int flag,i;
		System.out.println("Enter integer to know the prime numbers range");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		System.out.println("Prime numbers are:");
		for(int j=2;j<=n;j++)
		{
			for(i=2,flag=1;i<j;i++)
			{
				if(j%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
			System.out.println(j);
		}
	}
}
/*
Enter integer to know the prime numbers range
100
Prime numbers are:
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97

E:\JAVABASICS>
*/	
	
