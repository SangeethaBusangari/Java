import java.io.*;
class ExcepHandling
{
	public static int quotient(int n1,int n2)
	{
		if(n2==0)
		throw new ArithmeticException("Divisor cannot be zero");
		return n1/n2;
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any two numbers");
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		try
		{
			int result=quotient(n1,n2);
			System.out.println(n1+"/"+n2+"is"+result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("exception: an integer"+"cannot be divided by zero");
		}
		System.out.println("Execution continues..");
	}
}
/*
E:\JAVAprograms\ExceptionHandling>java ExcepHandling
Enter any two numbers
4
2
4/2is2
Execution continues..

E:\JAVAprograms\ExceptionHandling>java ExcepHandling
Enter any two numbers
10
0
exception: an integercannot be divided by zero
Execution continues..

E:\JAVAprograms\ExceptionHandling>

*/
