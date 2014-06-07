import java.io.*;
import java.util.*;
class STDemo
{
	public static void main(String args[])throws IOException
	{
		String str="she is a gentle women";
		StringTokenizer st=new StringTokenizer(str," ");
		while(st.hasMoreTokens())
		{
			String one=st.nextToken();
			System.out.println(one);
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac STDemo.java

E:\JAVAprograms\CollectionFramework>java STDemo
she
is
a
gentle
women

E:\JAVAprograms\CollectionFramework>*/
