import java.io.*;
import java.util.*;
class VectorDemo
{
	public static void main(String args[])throws IOException
	{
		Vector<Integer> v=new Vector<Integer>();
		int x[]={22,33,13,44,55};
		for(int i=0;i<x.length;i++)
		{
			v.add(x[i]);
		}
		System.out.println("Vector Elements:");
		for(int i=1;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("Elements using Listiterator:");
		ListIterator lit=v.listIterator();
		System.out.println("In forward direction:");
		while(lit.hasNext())
			System.out.println(lit.next()+"\t");
		System.out.println("In backword direction:");
		while(lit.hasPrevious())
			System.out.println(lit.previous()+"\t");
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac VectorDemo.java

E:\JAVAprograms\CollectionFramework>java VectorDemo
Vector Elements:
33
13
44
55
Elements using Listiterator:
In forward direction:
22
33
13
44
55
In backword direction:
55
44
13
33
22

E:\JAVAprograms\CollectionFramework>*/		
