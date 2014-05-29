import java.io.*;
class PolinNum
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter a digit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int t=n;
		int rev=0,x;
		while(n>0)
		{
			x=n%10;
			rev=rev*10+x;
			n=n/10;
		}
		if(t==rev)
		System.out.println("entered the value "+rev+" is polindrome");
		else
		System.out.println("it is not a ploindrome");
	}
}
/*
E:\JAVABASICS>java PolinNum
enter a digit
123
it is not a ploindrome

E:\JAVABASICS>java PolinNum
enter a digit
121
entered the value 121 is polindrome

E:\JAVABASICS>java PolinNum
enter a digit
555
entered the value 555 is polindrome

E:\JAVABASICS>*/
