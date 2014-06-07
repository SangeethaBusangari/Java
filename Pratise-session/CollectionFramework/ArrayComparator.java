import java.io.*;
import java.util.*;
class Ascend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i1.compareTo(i2);
	}
}
class Descend implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		return i2.compareTo(i1);
	}
}

class ArrayComparator
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many elements do you want to enter");
		int size=Integer.parseInt(br.readLine());
		Integer arr[]=new Integer[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Integer");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of the array");
		display(arr);
		Arrays.sort(arr,new Ascend());
		System.out.println("The ascending order array:");
		display(arr);
		System.out.println("The descending order array:");
		Arrays.sort(arr,new Descend());
		display(arr);
		
	}
	static void display(Integer arr[])
	{
		for(int i:arr)
			System.out.println(i+"\t");
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac ArrayComparator.java

E:\JAVAprograms\CollectionFramework>java ArrayComparator
How many elements do you want to enter
5
Enter Integer
4
Enter Integer
76
Enter Integer
54
Enter Integer
3
Enter Integer
87
Contents of the array
4
76
54
3
87
The ascending order array:
3
4
54
76
87
The descending order array:
87
76
54
4
3

E:\JAVAprograms\CollectionFramework>*/
