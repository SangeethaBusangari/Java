class specifier
{
	public String name="sangeetha";
	private int rno=1;
}
public class Keywords
{
	public static void main(String arg[])
	{
		specifier s=new specifier();
		System.out.println(s.name);
		//System.out.println(s.no);
	}
}
/*
E:\Classes&objects>javac Keywords.java
Keywords.java:12: cannot find symbol
symbol  : variable no
location: class specifier
                System.out.println(s.no);
                                    ^
1 error
*/
/*
E:\Classes&objects>javac Keywords.java

E:\Classes&objects>java Keywords
sangeetha

E:\Classes&objects>*/
