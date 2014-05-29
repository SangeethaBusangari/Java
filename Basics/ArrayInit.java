import java.io.*;
class ArrayInit
{
	public static void main(String args[])throws IOException
	{
		int x[]=new int[3];
		x[0]=1;
		x[1]=3;
		x[2]=5;
		int a[]={2,4,6,8};
		char arr[]={'H','I'};
		System.out.println("Array values are");
		for(int i=0;i<=a.length-1;i++)
		System.out.println(a[i]);
		System.out.println(x[1]);
		System.out.println(arr);
	}
}		
