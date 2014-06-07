public class Multipletry
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("in First block");
			int i=12/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("In first catch block");
		}
		try
		{
			System.out.println("In second try block");
			try
			{
				int a[]=new int[3];
				System.out.println("In inner try block");
				a[4]=30;
				System.out.println("Error before this line");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("In inner catch block");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of Bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("In first catch block");
		}
		catch(Exception e)
		{
			System.out.println("in exception block");
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>java Multipletry
in First block
In first catch block
In second try block
In inner try block
In inner catch block

E:\JAVAprograms\ExceptionHandling>
*/
