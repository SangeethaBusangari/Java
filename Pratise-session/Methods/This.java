class This
{
	private int x;
	This()
	{
		this(5);
		this.square();
	}
	This(int x)
	{
		this.x=x;
	}
	void square()
	{
		System.out.println("square value is"+ x*x);
	}
}
