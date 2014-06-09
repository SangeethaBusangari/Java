class StrBuilder
{
	public static void main(String args[])
	{
		String str="welcome to java programming";
		StringBuilder sb=new StringBuilder(str);
		System.out.println("before deleting"+sb);
		System.out.println("after deleting"+ sb.delete(11,15));
	}
}
/*
E:\JAVAprograms\Strings>javac StrBuilder.java

E:\JAVAprograms\Strings>java StrBuilder
before deletingwelcome to java programming
after deletingwelcome to  programming

E:\JAVAprograms\Strings>*/
