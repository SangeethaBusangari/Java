import java.io.*;
class Exp2
{
	public static void main(String args[])
	{
		try
		{
			int n=args.length;
			System.out.println(" open files");
			System.out.println("n="+n);
			int s=45/n;
			System.out.println("close files"+s);
			
			int b[]={10,20,30};
			b[50]=40;
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		finally
		{
			System.out.println("close files");
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Exp2.java

E:\JAVAprograms\ExceptionHandling>java Exp2 2 3 4
 open files
n=3
close files15
java.lang.ArrayIndexOutOfBoundsException: 50
close files

E:\JAVAprograms\ExceptionHandling>java Exp2
 open files
n=0
java.lang.ArithmeticException: / by zero
close files

E:\JAVAprograms\ExceptionHandling>*/
