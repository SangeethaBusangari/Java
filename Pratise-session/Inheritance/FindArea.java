class FindArea
{
	public static void main(String args[])
	{
		Figure f=new Figure(23.5,1.5);
		Rectangle r=new Rectangle(1.5,2.5);
		Triangle t=new Triangle(2.5,3.5);
		
		Figure fref;
		fref=f;
		System.out.println("area is"+fref.area());
		fref=r;
		System.out.println("area is"+fref.area());
		fref=t;
		System.out.println("area is"+fref.area());
	}
}
/*

E:\JAVAprograms\Inheritance>java FindArea
area in figure class is undefined
area is0.0
area inside rectangle is
area is3.75
area inside triangle is
area is8.75

E:\JAVAprograms\Inheritance>*/
