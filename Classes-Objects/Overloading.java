class Over
{
	int x,y;
	Over()
	{
		x=10;
		y=20;
		System.out.println("from default constructor"+y);
	}
	Over(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("from parameter constructor"+this.x);
	}
	void add(int x,int y)
	{
		int c=x+y;
		System.out.println(c);
	}
	void add(double a,double b)
	{
		double c=a+b;
		System.out.println(c);
	}
}
public class Overloading
{
	public static void main(String args[])
	{
		Over o=new Over(10,5);
		Over v=new Over();
		o.add(12,3);
		v.add(12.5,13.5);
	}
}
/*
E:\Classes&objects>javac Overloading.java

E:\Classes&objects>java Overloading
from parameter constructor10
from default constructor20
15
26.0

E:\Classes&objects>*/		
