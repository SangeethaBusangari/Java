import java.io.*;
import java.lang.String;
class Append
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter surname");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
                                 StringBuffer sb=new StringBuffer();
                                  sb.append(str);
		System.out.println("enter name");
		String name=br.readLine();
		sb.append(name);

                                 System.out.println("enter name");
		String middle=br.readLine();

		System.out.println("name"+ sb);
		int len=str.length();
		sb.insert(len,middle);
		System.out.println("full name"+sb);
	}
}
/*

E:\JAVAprograms\Strings>java Append
enter surname
b
enter name
sangeetha
namesangeetha

E:\JAVAprograms\Strings> */
