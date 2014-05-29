*/
 import java.util.Scanner;
public class StarPattern 
{
	public static void main(String[] args)
	{
		int longestRow = 10;

		for(int row=1 ; row<=longestRow ; ++row)
		{
			int i = (2*row) - 1;
			if(i>longestRow) i = 2*(longestRow-row+1) - 1;
			for(int j=0 ; j<(longestRow-i)/2 ; ++j) System.out.print(" ");
			for(int j=0 ; j<i ; ++j) System.out.print("*");
			for(int j=0 ; j<(longestRow-i)/2 ; ++j) System.out.print(" ");
			System.out.println();
		}
	}
}
/*
E:\JAVABASICS>java StarPattern
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

E:\JAVABASICS>*/
