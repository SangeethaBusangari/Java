class KnowName
{
	static void printName(Object obj)
	{
		Class c=obj.getClass();
		String name=c.getName();
		System.out.println("class name is"+name);
	}
}
