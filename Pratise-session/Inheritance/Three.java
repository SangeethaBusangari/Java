class Three extends Two
{
	int i=10;
	void display()
	{
		System.out.println("sub class of i"+i);
		System.out.println("accessing value using super keyword in subclass"+super.i);
		super.show();
	}
}
