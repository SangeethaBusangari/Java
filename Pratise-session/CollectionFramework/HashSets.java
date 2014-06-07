import java.io.*;
import java.util.*;
class HashSets
{
	public static void main(String args[])throws IOException
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("sangeetha");
		hs.add("kiranmai");
		hs.add("kiranmai");
		hs.add("jyothi");
		System.out.println("HashSet size:"+hs.size());
		System.out.println("HashSet contains:"+hs);
		hs.remove(1);
		hs.remove("sangeetha");
		System.out.println("HashSet size:"+hs.size());
		System.out.println("after removing.."+hs);
		System.out.println("using itearator");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac HashSets.java

E:\JAVAprograms\CollectionFramework>java HashSets
HashSet size:3
HashSet contains:[sangeetha, kiranmai, jyothi]
HashSet size:2
after removing..[kiranmai, jyothi]
using itearator
kiranmai
jyothi
*/
