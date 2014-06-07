import java.io.*;
class Conversion
{
	public static void main(String args[])throws IOException
	{
		Bank d=new Bank();
		double amount;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Conversion options are listed below:");
		System.out.println("1.dollors"+"\n"+"2.pounds"+"\n"+"3.rial\n");
		System.out.println("enter your choice");
		int n=Integer.parseInt(br.readLine());
		System.out.println("enter amount");
		double s=Double.parseDouble(br.readLine());
		switch(n)
		{
			case 1: 
					amount=d.dollors(s);
					System.out.println("The amount in dollors"+amount);
					break;
			case 2:amount=d.pounds(s);
					System.out.println("The amount in pounds"+amount);
					break;
			case 3:amount=d.rial(s);
					System.out.println("The amount in rials"+amount);
					break;
			case 4:System.out.println("invalid choice. enter 1..3 only");
					break;
		}
	}
}
/*

E:\JAVAprograms\Interfaces>java Conversion
Conversion options are listed below:
1.dollors
2.pounds
3.rial

enter your choice
2
enter amount
2000
The amount in pounds150600.0

E:\JAVAprograms\Interfaces>java Conversion
Conversion options are listed below:
1.dollors
2.pounds
3.rial

enter your choice
1
enter amount
2000
The amount in dollors97000.0

E:\JAVAprograms\Interfaces>java Conversion
Conversion options are listed below:
1.dollors
2.pounds
3.rial

enter your choice
3
enter amount
2000
The amount in rials28000.0

E:\JAVAprograms\Interfaces>java Conversion
Conversion options are listed below:
1.dollors
2.pounds
3.rial

enter your choice
4
enter amount
200
invalid choice. enter 1..3 only

E:\JAVAprograms\Interfaces>

*/
		
		
