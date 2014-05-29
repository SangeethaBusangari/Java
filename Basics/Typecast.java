class One
{
	void show1()
	{
		System.out.println("super class method");
	}
}
class Two extends One
{
	void show2()
	{
		System.out.println("sub class method");
	}
}
public class Typecast
{
	public static void main(String args[])
	{
		One o=(One)new Two();
		o.show1();
	}
}
/*
E:\JAVABASICS>javac Typecast.java

E:\JAVABASICS>java Typecast
super class method

E:\JAVABASICS>*/
