class Imp implements Second
{
	public void max(int a, int b)
	{
		if(a>b)
			System.out.println(" a is greater than b");
		else
			System.out.println(" b is greater than a");
	}
	public void min(int a, int b)
	{
		if(a<b)
			System.out.println(" a is less than b");
		else
			System.out.println(" b is less than a");
	}
	public void square(int s)
	{
		System.out.println("square of the value"+ (s*s));
	}
}
