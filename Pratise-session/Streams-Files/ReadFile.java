import java.io.*;
import java.lang.String;
class ReadFile
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fin=new FileInputStream("myfile.txt");
		System.out.println("File Contents");
		int ch;
		while((ch=fin.read())!=-1)
		System.out.print((char)ch);
		fin.close();
	}
}
/*
E:\Streams&Files>java ReadFile
File Contents
Hi Bindhu
Congratulations for your result
cheers!!
thanks for this time Lord.
iam happy with you

E:\Streams&Files>*/	
