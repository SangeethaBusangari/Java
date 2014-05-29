import java.io.*;
import java.lang.String;
public class Arithmetic
{
	public static void main(String args[])throws IOException
	{
		double res=0.0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter two Integers");
		double x=Double.parseDouble(br.readLine());
		double y=Double.parseDouble(br.readLine());
		System.out.println("Enter Operatator"+"\n"+"+ ->Addition"+"\n"+"- ->Subtraction"+"\n"+"* ->Multiplication"+"\n"+"/ ->Division"+"\n"+"% ->Remainder");
		char ch=(char)br.read();
		System.out.println("output:");
		switch(ch)
		{
			case '+' : res=x+y;
						System.out.println("Addition of two numbers"+res);
						break;
			case '-' : res=x-y;
						System.out.println("Subtraction of two numbers"+res);
						break;
			case '*' : res=x*y;
						System.out.println("Multiplication of two numbers"+res);
						break;						
			case '/' : res=x/y;
						System.out.println("Division of two numbers"+res);
						break;
			case '%' : res=x%y;
						System.out.println("Remainder of two numbers"+res);
						break;
			default:System.out.println("Invalid Input");
					System.exit(0);
					
		}
	}
}
/*
E:\JAVABASICS>javac Arithmetic.java

E:\JAVABASICS>java Arithmetic
enter two Integers
18
3
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
+
output:
Addition of two numbers21.0

E:\JAVABASICS>java Arithmetic
enter two Integers
18
3
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
-
output:
Subtraction of two numbers15.0

E:\JAVABASICS>java Arithmetic
enter two Integers
18
3
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
*
output:
Multiplication of two numbers54.0

E:\JAVABASICS>javac Arithmetic.java

E:\JAVABASICS>java Arithmetic
enter two Integers
18
3
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
/
output:
Division of two numbers6.0

E:\JAVABASICS>javac Arithmetic.java

E:\JAVABASICS>java Arithmetic
enter two Integers
18
3
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
%
output:
Remainder of two numbers0.0

E:\JAVABASICS>java Arithmetic
enter two Integers
1
10
Enter Operatator
+ ->Addition
- ->Subtraction
* ->Multiplication
/ ->Division
% ->Remainder
%
output:
Remainder of two numbers1.0

E:\JAVABASICS>*/
