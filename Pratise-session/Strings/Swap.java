import java.lang.String;
import java.io.*;
class Swap
{
	public static void main(String args[])throws IOException
	{
		System.out.println("Enter string1");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringBuffer sb=new StringBuffer();
		sb.append(str);
		System.out.println("enter String2");
		String str2=br.readLine();
		StringBuffer sb1=new StringBuffer();
			sb1.append(str2);
		StringBuffer sb2=new StringBuffer();
		sb2.append(sb);
		sb.append(sb1);
		sb1.append(sb2);
		System.out.println("After swapping");
		System.out.println(sb1);
		
	
	}
}
/*
E:\>javac Swap.java

E:\>java Swap
Enter string1
a
enter String2
s
After swapping
sa

E:\>*/
