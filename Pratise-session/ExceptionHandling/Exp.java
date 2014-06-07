class Exp
{
	public static void main(String args[])
	{
		int n=args.length;
		System.out.println(" open files");
		System.out.println("n="+n);
		int s=45/n;
		System.out.println("close files"+s);
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Exp.java

E:\JAVAprograms\ExceptionHandling>java Exp 3
 open files
n=1
close files45

E:\JAVAprograms\ExceptionHandling>java Exp
 open files
n=0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exp.main(Exp.java:8)

E:\JAVAprograms\ExceptionHandling>*/
