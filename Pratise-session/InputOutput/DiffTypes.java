import java.io.*;
import java.util.*;
class DiffTypes
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two integers with comma as a separator");
        	String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str,",");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
		s1=s1.trim();
		s2=s2.trim();
		s3=s3.trim();
		String name=s1;
		int age=Integer.parseInt(s2);
		double salary= Double.parseDouble(s3);
		System.out.println("Name ,age,salary"+name+age+salary);
	}
}
/*

E:\JAVAprograms\InputOutput>javac DiffTypes.java

E:\JAVAprograms\InputOutput>java DiffTypes
enter two integers with comma as a separator
sangeetha,20,200000
Name ,age,salarysangeetha20200000.0

E:\JAVAprograms\InputOutput>*/
