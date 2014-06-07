class Triangle extends Figure
{
	Triangle(double x,double y)
	{
		super(x,y);
	}
	double area()
	{
		System.out.println("area inside triangle is");
		return x*y;
	}
}
