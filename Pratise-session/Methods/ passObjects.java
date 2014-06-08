class passObjects
{
	public static void main(String args[])
	{
		Employee obj1=new Employee(10);
		Employee obj2=new Employee(20);
		Employee obj=new Employee(30,40);
		Check c=new Check();
		System.out.println("objects before swapping="+ obj1.id+ "and"+obj2.id);
		c.swap(obj1,obj2);
		c.swap(obj);
	}
}
/*

E:\JAVAprograms\Methods>java passObjects
objects before swapping=10and20
objects after swapping=20and10
objects after swapping=40and30

E:\JAVAprograms\Methods>*/
