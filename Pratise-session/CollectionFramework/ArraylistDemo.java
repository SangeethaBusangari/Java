import java.io.*;
import java.util.*;
class ArraylistDemo
{
	public static void main(String args[])throws IOException
	{
		ArrayList arl=new ArrayList<String>();
		arl.add("sangeetha");
		arl.add("kiranmai");
		arl.add("kiranmai");
		arl.add("jyothi");
		System.out.println("arrayList contains:"+arl);
		arl.remove(3);
		arl.remove("sangeetha");
		System.out.println("after removing.."+arl);
		System.out.println("using itearator");
		Iterator it=arl.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>java ArraylistDemo
arrayList contains:[sangeetha, kiranmai, kiranmai, jyothi]
after removing..[kiranmai, kiranmai]
using itearator
kiranmai
kiranmai

E:\JAVAprograms\CollectionFramework>

*/
