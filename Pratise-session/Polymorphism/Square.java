class Square
{
	public static void main(String args[])
	{
		Two t=new Two();
		t.calculate(25);
		One o=new Two();//if calculate method is declared as static then it will display result from super class
		o.calculate(25);
	}
}
/*

E:\JAVAprograms\Polymorphism>java Square
square root value is5.0
square root value is5.0
E:\JAVAprograms\Polymorphism>*/
