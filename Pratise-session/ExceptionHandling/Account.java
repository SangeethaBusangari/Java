public class Account
{
	public static void main(String args[])
	{
		int amount=1000;
		int intrest;
		int total;
		System.out.println("calculating intrest for the amount:");
		try
		{
			for(int month=5;month>=0;month--)
			{
				intrest=amount/month;
				total=amount+intrest;
				System.out.println("Total amount:"+total);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Account.java

E:\JAVAprograms\ExceptionHandling>java Account
calculating intrest for the amount:
Total amount:1200
Total amount:1250
Total amount:1333
Total amount:1500
Total amount:2000
java.lang.ArithmeticException: / by zero
        at Account.main(Account.java:13)

E:\JAVAprograms\ExceptionHandling>*/
