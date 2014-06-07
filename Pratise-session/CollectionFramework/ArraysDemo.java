import java.io.*;
import java.util.*;
class ArraysDemo
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Integer");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of the array");
		display(arr);
		Arrays.sort(arr);
		System.out.println("The sorted array:");
		display(arr);
		System.out.println("which element to search");
		int element=Integer.parseInt(br.readLine());
		int index=Arrays.binarySearch(arr,element);
		if(index<0)
			System.out.println("element not found");
		else
			System.out.println("element found at:"+(index+1) +"location");
	}
	static void display(int arr[])
	{
		for(int i:arr)
			System.out.println(i);
	}
}
/*
E:\JAVAprograms\CollectionFramework>java ArraysDemo
Enter Integer
23
Enter Integer
54
Enter Integer
76
Enter Integer
87
Enter Integer
654
Contents of the array
23
54
76
87
654
The sorted array:
23
54
76
87
654
which element to search
76
element found at:3location

E:\JAVAprograms\CollectionFramework>*/
