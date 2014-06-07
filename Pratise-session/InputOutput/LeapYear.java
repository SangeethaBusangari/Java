import java.io.*;
class LeapYear
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter year");
		int a=Integer.parseInt(br.readLine());
		if(a%100==0&&a%400==0)
		System.out.println("Entered year is a leap year");
		else if(a%4==0&& a%100!=0)
		System.out.println("Entered year is a leap year");
		else
		System.out.println("entered year is not a leap year");
        	
	}
}
/*

E:\JAVAprograms\InputOutput>java LeapYear
enter year
2000
Entered year is a leap year

E:\JAVAprograms\InputOutput>java LeapYear
enter year
2013
entered year is not a leap year

E:\JAVAprograms\InputOutput>*/
