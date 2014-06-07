class Test extends Student1
{
	protected double s1,s2;
	void getMarks(double x,double y)
	{
		s1=x;
		s2=y;
	}
	void putMarks()
	{
		System.out.println("sub1\t"+s1);
		System.out.println("sub2\t"+s2);
	}
}
	
