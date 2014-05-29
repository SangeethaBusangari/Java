class Const
{
	String name="sangeetha";
	int x,top;
	Const()
	{
		this(2);
		top=-1;
		name="stack";
		System.out.println("top value"+top);
		
	}
	Const(int x)
	{
		this.x=x;
		System.out.println("x= "+x);
	}
}
public class Init
{
	public static void main(String args[])
	{
		Const c=new Const();
		System.out.println("name\t"+ c.name);
	}
}
/*
E:\Classes&objects>javac Init.java

E:\Classes&objects>java Init
x= 2
top value-1
name    stack

E:\Classes&objects>*/
