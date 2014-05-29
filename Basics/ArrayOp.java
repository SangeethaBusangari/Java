import java.io.*;
import java.util.Scanner;
class ArrayOp
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter no of rows and columns \n");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int num1[][]=new int[r][c];
		int num2[][]=new int[r][c];
		int res[][]=new int[r][c];
		System.out.println("Enter"+r+"x"+c+ "Integers for num1\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				num1[i][j]=sc.nextInt();
		}
		System.out.println("Enter"+r+"x"+c+ "Integers for num2\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				num2[i][j]=sc.nextInt();
		}
		System.out.println("performing addition....\n");
		for(int k=0;k<r;k++)
		{
			for(int l=0;l<c;l++)
			{
				res[k][l]=num1[k][l]+num2[k][l];
			}
		}
		System.out.println("Result of addition matrix:\n");
		for(int k=0;k<r;k++)
		{
			for(int l=0;l<c;l++)
			{
				System.out.print(res[k][l]+"\t");
			}
			System.out.println();
		}
		System.out.println("performing subtraction....\n");
		for(int k=0;k<r;k++)
		{
			for(int l=0;l<c;l++)
			{
				res[k][l]=num1[k][l]-num2[k][l];
			}
		}
		System.out.println("Result of subtraction matrix:\n");
		for(int k=0;k<r;k++)
		{
			for(int l=0;l<c;l++)
			{
				System.out.print(res[k][l]+"\t");
			}
			System.out.println();
		}
		System.out.println("After transposing num1 matrix\n");
		for(int k=0;k<c;k++)
		{
			for(int l=0;l<r;l++)
			{
				System.out.print(num1[l][k]+"\t");
			}
			System.out.println();
		}
	}
}
/*
E:\JAVABASICS>java ArrayOp
enter no of rows and columns

2 2
Enter2x2Integers for num1

1 2
3 4
Enter2x2Integers for num2

5 6
7 8
performing addition....

Result of addition matrix:

6       8
10      12
After transposing num1 matrix

13
24

E:\JAVABASICS>javac ArrayOp.java

E:\JAVABASICS>java ArrayOp
enter no of rows and columns

2
2
Enter2x2Integers for num1

5 6
7 8
Enter2x2Integers for num2

1 3
2 4
performing addition....

Result of addition matrix:

6       9
9       12
performing subtraction....

Result of subtraction matrix:

4       3
5       4
After transposing num1 matrix

5       7
6       8

E:\JAVABASICS>*/	
