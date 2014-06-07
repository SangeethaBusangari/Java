import java.io.*;
import java.util.Scanner;
class Transpose
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter no of rows and columns \n");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int num[][]=new int[r][c];
		System.out.println("Enter"+r+"x"+c+ "Integers\n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				num[i][j]=sc.nextInt();
		}
		System.out.println("After transposing\n");
		for(int k=0;k<c;k++)
		{
			for(int l=0;l<r;l++)
			{
				System.out.print(num[l][k]);
			}
			System.out.println();
		}
	}
}
/*
E:\JAVAprograms\Arrays>java Transpose
enter no of rows and columns

2
2
Enter2x2Integers

3
4
5
6
After transposing

35
46

E:\JAVAprograms\Arrays>*/	
