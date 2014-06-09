class StrCompare
{
	public static void main(String args[])
	{
		String st="welcome to string functions";
		String st1=new String("welcome to string functions");
		//if(st==st1)//it can't display message
		//System.out.println("both are equal");
		if(st.equals(st1))
		System.out.println("equal strings");
	}
}
/*
E:\JAVAprograms\Strings>javac StrCompare.java

E:\JAVAprograms\Strings>java StrCompare
equal strings

E:\JAVAprograms\Strings>*/
