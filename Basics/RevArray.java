import java.io.*;
class RevArray
{
	public static void main(String args[])throws IOException
	{
		int a[]={2,4,6,8};
		System.out.println("Array values are");
		for(int i=a.length-1;i>=0;i--)
		System.out.println(a[i]);
	}
}		
/*
E:\JAVABASICS>javac RevArray.java

E:\JAVABASICS>java RevArray
Array values are
8
6
4
2

E:\JAVABASICS>*/
