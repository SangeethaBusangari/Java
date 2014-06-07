class Maruthi extends Car
{
	Maruthi(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("take left");
		System.out.println("This is ordinary steering in maruthi");
	}
	void breaking(int force)
	{
		System.out.println("brakes applied");
	}
}
