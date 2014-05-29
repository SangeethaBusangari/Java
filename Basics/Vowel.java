import java.io.*;
import java.lang.String;
public class Vowel
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter charecter");
		char ch=(char)br.read();	
		switch(ch)
		{
			case 'A' :System.out.println(ch+" is a Vowel");
						break;
			case 'E' : System.out.println(ch+" is a Vowel");
						break;
			case 'I' : System.out.println(ch+" is a Vowel");
						break;						
			case 'O' : System.out.println(ch+" is a Vowel");
						break;
			case 'U' : System.out.println(ch+" is a Vowel");
						break;
			case 'a' :System.out.println(ch+" is a Vowel");
						break;
			case 'e' : System.out.println(ch+" is a Vowel");
						break;
			case 'i' : System.out.println(ch+" is a Vowel");
						break;						
			case 'o' : System.out.println(ch+" is a Vowel");
						break;
			case 'u' : System.out.println(ch+" is a Vowel");
						break;
			default:System.out.println(ch+" is not a  Vowel");
					System.exit(0);	
		}
	}
}
/*
E:\JAVABASICS>java Vowel
enter charecter
e
e is a Vowel

E:\JAVABASICS>java Vowel
enter charecter
E
E is a Vowel

E:\JAVABASICS>java Vowel
enter charecter
t
t is not a  Vowel

E:\JAVABASICS>java Vowel
enter charecter
Y
Y is not a  Vowel

E:\JAVABASICS>
*/
