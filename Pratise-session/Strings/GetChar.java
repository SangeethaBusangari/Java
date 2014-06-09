class GetChar
{
	public static void main(String args[])
	{
		char str[]=new char[20];
		String st=new String("welcome to string functions");
		st.getChars(0,7,str,0);
		System.out.println(str);
	}
}
/*

E:\JAVAprograms\Strings>javac GetChar.java

E:\JAVAprograms\Strings>java GetChar
welcome

E:\JAVAprograms\Strings>*/
