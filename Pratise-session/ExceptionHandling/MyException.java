class MyException extends Exception
{
	private static int accno[]={1001,1002,1003,1004,1005};
	private static String name[]={"Sangeetha","Karuna","kalpana","kavitha","nirmala"};
	private static double bal[]={10000.3,30000,5,3222,5646,99};
	MyException()
	{
	}
	MyException(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		try
		{
			System.out.println("Accno:"+"\t"+"Customer"+"\t"+"Balance");
			for(int i=0;i<5;i++)
			{
				System.out.println(accno[i]+"\t"+name[i]+"]t"+bal[i]);
				if(bal[i]<1000)
				{
					MyException me=new MyException("Balance amount is lessthan 1000");
					throw me;
				}
			}
		}
		catch(MyException me)
		{
			me.printStackTrace();
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>java MyException
Accno:  Customer        Balance
1001    Sangeetha]t10000.3
1002    Karuna]t30000.0
1003    kalpana]t5.0
MyException: Balance amount is lessthan 1000
        at MyException.main(MyException.java:23)

E:\JAVAprograms\ExceptionHandling>

*/
