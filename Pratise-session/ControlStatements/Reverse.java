import java.io.*;
class Reverse
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter a digit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int rev=0,x;
		while(n>0)
		{
			x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		System.out.println("after reversing the value is"+rev);
	}
}
