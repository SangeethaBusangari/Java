import java.io.*;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
public class Sorted_set
{
	public static void main(String args[])throws IOException
	{
		SortedSet sorted_data=new TreeSet();
		SortedSet sorted_number=new TreeSet();
		System.out.println("adding");
		sorted_data.add(new String("sangeetha"));
		sorted_data.add(new String("Hemalatha"));
		sorted_data.add(new String("srilatha"));
		sorted_data.add(new String("mahitha"));
		sorted_data.add(new String("sahitha"));
		sorted_data.add(new String("druvitha"));
		sorted_data.add(new String("Druvitha"));
		sorted_data.add(new String("DRuvitha"));
		sorted_data.add(new String("vanitha"));
		sorted_data.add(new String("saritha"));
		sorted_data.add(new String("madhulatha"));
		sorted_data.add(new String("samantha"));
		sorted_data.add(new String("mamatha"));
		sorted_number.add(new Integer(22));	
		sorted_number.add(new Integer(224));
		sorted_number.add(new Integer(226));
		sorted_number.add(new Integer(221));
		sorted_number.add(new Integer(1999));
		
		System.out.println("Displaying data in Data set");
		Iterator ii=sorted_data.iterator();
		while(ii.hasNext())
		{
			System.out.println(" "+ii.next());
		}
		System.out.println("Displaying data in number set");
		ii=sorted_number.iterator();
		while(ii.hasNext())
		{
			System.out.println(" "+ii.next());
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac Sorted_set.java
Note: Sorted_set.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

E:\JAVAprograms\CollectionFramework>java Sorted_set
adding
Displaying data in Data set
 DRuvitha
 Druvitha
 Hemalatha
 druvitha
 madhulatha
 mahitha
 mamatha
 sahitha
 samantha
 sangeetha
 saritha
 srilatha
 vanitha
Displaying data in number set
 22
 221
 224
 226
 1999

E:\JAVAprograms\CollectionFramework>*/		
