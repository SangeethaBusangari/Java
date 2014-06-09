import java.lang.String;
class StrDecl
{
	public static void main(String args[])
	{
		String s1="Hi";
		String s2=new String("Sangeetha");
		String spi=new String("spilt me into multiple lines");
		//char arr[]={'w','e','l','c,'o','m','e'};
		//String s3=new String(arr);
		String s4=s1.concat(s2);
		System.out.println("String 1 is"+ s1);
		System.out.println("String 2 is"+ s2);
		//System.out.println("String 3 is"+ s3);
		System.out.println("concatination of strings...."+s4);
		System.out.println("length of s1 is...."+s1.length());
		boolean x=s1.startsWith("H");
		if(x)
		System.out.println("s1 starts with H only");
		else
		System.out.println("s1 does not starts with H");
		String sstr=s2.substring(3,9);
		System.out.println("substring...."+sstr);
		System.out.println("uppercase s1...."+s1.toUpperCase());
		System.out.println("lowercase s2...."+s2.toLowerCase());
		System.out.println("replaced string is...."+s1.replace("Hi","Hello"));
		String splt[]=spi.split(" ");
		for(int i=0;i<splt.length;i++)
		System.out.println(splt[i]);
	}
}
/*

E:\JAVAprograms\Strings>java StrDecl
String 1 isHi
String 2 isSangeetha
concatination of stringsHiSangeetha
length of s1 is2
s1 starts with H only
substringgeetha
uppercase s1HI
lowercase s2sangeetha
replaced string isHello
spilt
me
into
multiple
lines

E:\JAVAprograms\Strings>*/
