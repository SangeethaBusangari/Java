public class Bank
{
	int totalbal []=new int[4];
	int profit=0;
	int accbal;
	String cust_name;
	public Bank(String name,int acc_bal)
	{
		this.accbal=acc_bal;
		this.cust_name=name;
	}
	public void accbal()
	{
		totalbal[0]=2000;
		try
		{
			for(int i=0;i<=2;i++)
			{
				profit=accbal/(i+1);
				totalbal[i]=accbal+profit;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured..."+e.toString());
		}
		try
		{
			System.out.println("New Account Balance: ");
			for(int i=0;i<=5;i++)
			{
				System.out.println("balance is"+totalbal[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("Exception occured..."+aie.toString());
		}
		finally
		{
			System.out.println(cust_name+"Account information successfully updated..");
		}
	}
	public static void main(String args[])
	{
		Bank obj=new Bank("Sangeetha",1000);
		System.out.println("Calling acc bal for sangeetha");
		obj.accbal();
		Bank obj1=new Bank("Karuna",1000);
		System.out.println("Calling acc bal for Karuna");
		obj1.accbal();
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Bank.java

E:\JAVAprograms\ExceptionHandling>java Bank
Calling acc bal for sangeetha
New Account Balance:
balance is2000
balance is1500
balance is1333
balance is0
Exception occured...java.lang.ArrayIndexOutOfBoundsException: 4
SangeethaAccount information successfully updated..
Calling acc bal for Karuna
New Account Balance:
balance is2000
balance is1500
balance is1333
balance is0
Exception occured...java.lang.ArrayIndexOutOfBoundsException: 4
KarunaAccount information successfully updated..

E:\JAVAprograms\ExceptionHandling>*/	
