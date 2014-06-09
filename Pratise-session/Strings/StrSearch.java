import java.io.*;
import java.lang.String;
class StrSearch
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter no of strings do you want to store in an array");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String arr[]=new String[n];
		System.out.println("enter"+ n + "strings");
		for(int i=0;i<n;i++)
			arr[i]=br.readLine();
		System.out.println("Enter search String");
		String search=br.readLine();
		boolean flag=false;
		for(int k=0; k<arr.length;k++)
		{
			if(search.equals(arr[k]))
			{
				System.out.println("search string found at"+ (k+1) +"position");
				flag=true;
			}
		}
		if(!flag)
		System.out.println("String not found");
	}
}
/*
E:\JAVAprograms\Strings>java StrSearch
enter no of strings do you want to store in an array
6
enter6strings
sangeetha
ok
good
girl
you
can
Enter search String
good
search string found at3position

E:\JAVAprograms\Strings>java StrSearch
enter no of strings do you want to store in an array
2
enter2strings
hi
bye
Enter search String
hello
String not found

E:\JAVAprograms\Strings>*/
