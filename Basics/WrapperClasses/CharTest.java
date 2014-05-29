import java.io.*;
class CharTest
{
	public static void main(String args[])throws IOException
	{
		char ch;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("enter a character/digit\n");
			ch=(char)br.read();
			if(Character.isDigit(ch))
			System.out.println("you entered a digit");
			else if(Character.isUpperCase(ch))
			System.out.println("you entered a UpperCase letter");
			else if(Character.isLowerCase(ch))
			System.out.println("you entered a LowerCase letter");
			else if(Character.isSpaceChar(ch))
			System.out.println("you entered a spacebar");
			else if(Character.isWhitespace(ch))
			System.out.println("you entered a whitespace");
			else
			System.out.println("you entered special charecter");
			br.skip(2);
		}
	}
}
/*
E:\WrapperClasses>javac CharTest.java

E:\WrapperClasses>java CharTest
enter a character/digit

2
you entered a digit
enter a character/digit

n
you entered a LowerCase letter
enter a character/digit

C
you entered a UpperCase letter
enter a character/digit


you entered a spacebar
enter a character/digit


you entered a whitespace
enter a character/digit

)
you entered special charecter
enter a character/digit*/
