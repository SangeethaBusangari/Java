class MergeArray
{
	public static void main(String args[])
	{
		Merge m=new Merge();
		m.merging();
	}
}

import java.io.*;
class Merge
{
	int arr1[]={1,2,3,4};
	int arr2[]={5,6,7,8};
	int arr3[]=new int[10];
	static int a;
	int x;
	void merging()
	{
		for(int i=a;i<8;i++)
		{
			for(int j=a;j<arr1.length&&(j<=a);j++)
			{
				arr3[x]=arr1[j];
			}
			x++;
			for(int k=a;k<arr2.length&&(k<=a);k++)
			{
				arr3[x]=arr2[k];
			}
			a++;
			x++;
		}
		System.out.println("Array elements are");
		for(int l=0;l<a;l++)
		{
			System.out.println(arr3[l]);
		}
	}
}
/*
E:\JAVABASICS>javac MergeArray.java

E:\JAVABASICS>java MergeArray
Array elements are
1
5
2
6
3
7
4
8
*/			
