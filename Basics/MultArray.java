import java.io.*;
import java.util.Scanner;
class MultArray
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter no of rows and columns for num1 \n");
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int num1[][]=new int[r1][c1];
		System.out.println("enter no of rows and columns for num2 \n");
		int r2=sc.nextInt();
		int c2=sc.nextInt();
		int num2[][]=new int[r2][c2];
		int res[][]=new int[r2][c1];
		if(c1!=r2)
		{
			System.out.println("MULTIPLICATION not possible");
			System.exit(0);
		}
		System.out.println("Enter"+r1+"*"+c1+ "Integers for num1\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
				num1[i][j]=sc.nextInt();
		}
		System.out.println("Enter"+r2+"*"+c2+ "Integers for num2\n");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
				num2[i][j]=sc.nextInt();
		}
		System.out.println("performing multiplication....\n");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				res[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					res[i][j]+=num1[i][k]*num2[k][j];
				}
			}
		}
		System.out.println("Result of multiplication matrix:\n");
		for(int k=0;k<r1;k++)
		{
			for(int l=0;l<c2;l++)
			{
				System.out.print(res[k][l]+"\t");
			}
			System.out.println();
		}
	}
}
/*
E:\JAVABASICS>java MultArray
enter no of rows and columns for num1

2
2
enter no of rows and columns for num2

2
2
Enter2*2Integers for num1

1 2
1 2
Enter2*2Integers for num2

3 2
3 2
performing multiplication....

Result of multiplication matrix:

9       6
9       6

E:\JAVABASICS>*/
/*
E:\JAVABASICS>java MultArray
enter no of rows and columns for num1

2 4
enter no of rows and columns for num2

3 5
MULTIPLICATION not possible

E:\JAVABASICS>*/
