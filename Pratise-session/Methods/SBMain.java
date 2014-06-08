class SBMain
{
	static
	{
		System.out.println("static block1");
	}
	static
	{
		System.out.println("static block2");
	}
	public static void main(String arg[])
	{
		System.out.println("main method");
	}
	static
	{
		System.out.println("static block3");
	}
	
}
/*
E:\JAVAprograms\Methods>javac SBMain.java

E:\JAVAprograms\Methods>java SBMain
static block1
static block2
static block3
main method

E:\JAVAprograms\Methods>*/
