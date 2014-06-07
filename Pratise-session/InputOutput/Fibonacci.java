import java.io.*;
import java.util.*;
class Fibonacci
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter an integer");
		int n=Integer.parseInt(br.readLine());
		int a=0,b=1,c=0,i=0;
		System.out.println(a);
		System.out.println(b);
		while(i<=n-2)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}

        	
	}
}
/*

E:\JAVAprograms\InputOutput>java Fibonacci
enter an integer
4
0
1
1
2
3

E:\JAVAprograms\InputOutput>*/
