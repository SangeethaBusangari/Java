class Two extends One
{
	int i=20;
	void show()
	{
		System.out.println("sub class of i"+i);
		System.out.println("accessing value using super keyword in subclass"+super.i);
		super.show();
	}
}
/*
E:\JAVAprograms\Inheritance>javac Override.java

E:\JAVAprograms\Inheritance>java Override
sub class of i20
accessing value using super keyword in subclass30
super class of i30

E:\JAVAprograms\Inheritance>*/
