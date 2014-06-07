import java.io.*;
class CommandLineArg
{
	public static void main(String args[])
	{
		int n=args.length;
		System.out.print("number of arguments entered is:" +n);
		for(int i=0;i<n;i++)
		System.out.println("args["+i+"]"=args[i]);
		
	}
}
