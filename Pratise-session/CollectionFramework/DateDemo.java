import java.io.*;
import java.util.*;
import java.text.*;
class DateDemo
{
	public static void main(String args[])throws IOException
	{
		Date d=new Date();
		DateFormat fmt=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,Locale.UK);
		String str=fmt.format(d);
		System.out.println(str);
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac DateDemo.java

E:\JAVAprograms\CollectionFramework>java DateDemo
07-Jul-2013 22:25

E:\JAVAprograms\CollectionFramework>*/
