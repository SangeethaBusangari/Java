import java.io.*;
class Random1
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		int n=Integer.parseInt(br.readLine());
		int counter=0;
		while(true)
		{
			double d=n*Math.random();
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
E:\WrapperClasses>java Random1
enter any number
5
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
