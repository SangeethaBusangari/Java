abstract class Car
{
	int regno;
	Car(int regno)
	{
		this.regno=regno;
	}
	abstract void steering(int direction, int angle);
	abstract void breaking(int force);
	void openTank()
	{
		System.out.println("fill the tank");
	}
}
