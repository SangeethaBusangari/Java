import java.io.*;
class Factorial
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter number to find factorial");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int fact=1;
		for(int i=1;i<=n;i++)
			fact=fact*i;
		System.out.println("factorial of a number is"+ fact);
	}
}
/*
E:\JAVABASICS>java Factorial
Enter number to find factorial
5
factorial of a number is120

E:\JAVABASICS>java Factorial
Enter number to find factorial
6
factorial of a number is720

E:\JAVABASICS>java Factorial
Enter number to find factorial
7
factorial of a number is5040

E:\JAVABASICS>*/
