/*Using this with a Constructor. (Calling constructors from constructors)*/
class thisConstructor
{
	int noOfWatts;
	boolean indicator;
	String location;
	thisConstructor()
	{
		this("here");
		System.out.println("default constructor");
	}
	thisConstructor(String site)
	{
		this(100,true,"Hyderabad");
		String location;
		location=site;
		System.out.println("constructor2");
	}
	thisConstructor(int noOfWatts,boolean indicator,String site)
	{
		super();
		String location;
		this.noOfWatts=noOfWatts;
		this.indicator=indicator;
		location=site;
		System.out.println("constructor3");
	}
	public static void main(String args[])
	{
		thisConstructor t1=new thisConstructor();
		thisConstructor t2=new thisConstructor("Hyderabad");
		thisConstructor t3=new thisConstructor(100,false,"Here only");
		
	}
}
/*
E:\Classes&objects>javac thisConstructor.java

E:\Classes&objects>java thisConstructor
constructor3
constructor2
default constructor
constructor3
constructor2
constructor3

E:\Classes&objects>

*/
