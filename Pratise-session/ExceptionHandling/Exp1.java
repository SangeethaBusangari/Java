class Exp1
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
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("close files");
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Exp1.java

E:\JAVAprograms\ExceptionHandling>java Exp1
 open files
n=0
java.lang.ArithmeticException: / by zero
close files

E:\JAVAprograms\ExceptionHandling>java Exp1 3
 open files
n=1
close files45
close files

E:\JAVAprograms\ExceptionHandling>*/
