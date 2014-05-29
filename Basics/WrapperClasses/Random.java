import java.io.*;
class Random
{
	public static void main(String args[])throws Exception
	{
		int counter=0;
		while(true)
		{
			double d=100*Math.random();
			int i=(int)d;
			System.out.println("Random number is"+1);
			counter++;
			System.out.println("counter="+counter);
			Thread.sleep(20);
			if(i==0)
				System.exit(0);
		}
	}
}
/*
E:\WrapperClasses>java Random
Random number is1
counter=1
Random number is1
counter=2
Random number is1
counter=3
Random number is1
counter=4
Random number is1
counter=5
Random number is1
counter=6
Random number is1
counter=7
Random number is1
counter=8
Random number is1
counter=9
Random number is1
counter=10

E:\WrapperClasses>*/	
