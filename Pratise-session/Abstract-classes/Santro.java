class Santro extends Car
{
	Santro(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("take left");
		System.out.println("This is power steering in Santro");
	}
	void breaking(int force)
	{
		System.out.println("gas brakes applied");
	}
}
