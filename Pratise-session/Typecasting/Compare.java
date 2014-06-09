class Compare
{
	public static void main(String args[])
	{
		MyClass obj1=new MyClass(10);
		MyClass obj2=new MyClass(10);
		
		Integer obj3=new Integer(15);
		Integer obj4=new Integer(15);
		if(obj1.equals(obj2))
			System.out.println("objects are equal");
		else
			System.out.println("objects are not equal");
		if(obj3.equals(obj4))
			System.out.println("wrapper objects are equal");
		else
			System.out.println("Wrapper objects are not equal");
	}
}
/*

E:\JAVAprograms\Typecasting>java Compare
objects are not equal
wrapper objects are equal

E:\JAVAprograms\Typecasting>*/
