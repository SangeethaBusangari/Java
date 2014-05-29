class StrBuilder
{
	public static void main(String args[])
	{
		String str="welcome to java programming";
		StringBuilder sb=new StringBuilder(str);
		System.out.println("Before deleting "+sb);
		System.out.println("After deleting "+ sb.delete(11,15));
	}
}
/*
E:\JAVABASICS>java StrBuilder
Before deleting welcome to java programming
After deleting welcome to  programming

E:\JAVABASICS>*/
