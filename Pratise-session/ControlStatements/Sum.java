import java.io.*;
class Sum
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter a digit to get sum");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int sum=0,x;
		for(;n>0;)
		{
			x=n%10;
			sum=sum+x;
			n=n/10;
		}
		System.out.println("sum of the value is"+sum);
	}
}
