class Rectangle extends Figure
{
	Rectangle(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		System.out.println("area inside rectangle is");
		return x*y;
	}
}
