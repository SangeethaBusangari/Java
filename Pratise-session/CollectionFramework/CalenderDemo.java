import java.io.*;
import java.util.*;
class CalenderDemo
{
	public static void main(String args[])throws IOException
	{
		Calendar cl=Calendar.getInstance();
		System.out.println("Current date:");
		int dd=cl.get(Calendar.DATE);
		int mm=cl.get(Calendar.MONTH);
		int yy=cl.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.println("Current Time:");
		int h=cl.get(Calendar.HOUR);
		int m=cl.get(Calendar.MINUTE);
		int s=cl.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);
		int x=cl.get(Calendar.AM_PM);
		if(x==0)
			System.out.println("Good Morning");
		else
			System.out.println("Good evening");
	}
}
/*
E:\JAVAprograms\CollectionFramework>java CalenderDemo
Current date:
7-6-2013
Current Time:
10:18:36
Good evening

E:\JAVAprograms\CollectionFramework>*/
