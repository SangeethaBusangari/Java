class UseCar
{
	public static void main(String args[])
	{
		Maruthi m=new Maruthi(1010);
		Santro s=new Santro(2010);
		Car ref;
		ref=m;
		m.steering(1,90);
		m.breaking(500);
		ref=s;
		s.steering(2,90);
		s.breaking(1000);
		s.openTank();
	}
}
/*

E:\JAVAprograms\AbstractClasses>java UseCar
take left
This is ordinary steering in maruthi
brakes applied
take left
This is power steering in Santro
gas brakes applied
fill the tank

E:\JAVAprograms\AbstractClasses>*/
