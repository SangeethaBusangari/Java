class Student1
{
	protected int rno;
	protected String name;
	void get_info(int a,String b)
	{
		rno=a;
		name=b;
	}
	void put_info()
	{
		System.out.println("rno\t"+rno);
		System.out.println("name\t"+name);
	}
}
