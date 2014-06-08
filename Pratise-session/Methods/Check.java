class Check
{
	void swap(Employee obj1,Employee obj2)
	{
		Employee temp=obj1;
		obj1=obj2;
		obj2=temp;
		System.out.println("objects after swapping="+ obj1.id+ "and"+obj2.id);
	}
	void swap(Employee obj)
	{
		int temp=obj.id1;
		obj.id1=obj.id2;
		obj.id2=temp;
		System.out.println("objects after swapping="+ obj.id1+ "and"+obj.id2);
	}
}
