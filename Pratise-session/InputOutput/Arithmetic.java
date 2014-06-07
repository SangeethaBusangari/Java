import java.io.*;
import java.util.*;
class Arithmetic
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two integers with comma as a separator");
        	String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		double n1=Double.parseDouble(s1);
		double n2=Double.parseDouble(s2);
		System.out.println("addition is="+(n1+n2));
	}
}
/*

E:\JAVAprograms\InputOutput>java Arithmetic
enter two integers with comma as a separator
3,4
addition is=7.0

E:\JAVAprograms\InputOutput>*/
