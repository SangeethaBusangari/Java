class User
{
	public static void main(String args[])
	{
		User use=new User();
		try
		{
			use.withDraw("sangeetha",69);
			use.withDraw("busangari",400);
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
	}
	public void withDraw(String customer_name, int amount)throws Maxamount
	{
		if(amount>200)
		{
			throw new Maxamount(customer_name,amount);
		}
		else
		{
			System.out.println(customer_name+"has specified amount with in limits.... withdrawn amount is:"+amount);
		}
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac User.java

E:\JAVAprograms\ExceptionHandling>javac Maxamount.java

E:\JAVAprograms\ExceptionHandling>java Maxamount
Exception in thread "main" java.lang.NoSuchMethodError: main

E:\JAVAprograms\ExceptionHandling>*/
