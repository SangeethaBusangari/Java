import java.io.*;
class ReadFile1
{
	public static void main(String args[])throws IOException
	{
		int ch;
		FileReader fr=null;
		try
		{
			fr=new FileReader("text.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
		}
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}
}
/*
E:\Streams&Files>java ReadFile1
Hyderabad is one of the beautiful city
E:\Streams&Files>*/
