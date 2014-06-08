//calling static method from non static context
class NStatic
{
	static int a=10,b=5,c;
	void add()
	{
		int c=a+b;
		System.out.println("addition="+c);
		sub();
	}
	static void sub()
	{
		c=a-b;
		System.out.println("subtraction="+c);
	}
}
