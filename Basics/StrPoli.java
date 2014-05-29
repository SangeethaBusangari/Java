import java.io.*;
class StrPoli
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer temp=new StringBuffer(str);
		temp=temp.reverse();
		if(str.equals(temp.toString()))
			System.out.println("enter string is palindrome");
		else
			System.out.println("entered string is not polindrome");
	}
}
/*

E:\JAVABASICS>javac StrPoli.java

E:\JAVABASICS>java StrPoli
enter string
madam
enter string is palindrome

E:\JAVABASICS>java StrPoli
enter string
we
entered string is not polindrome

E:\JAVABASICS>*/
