import java.io.*;
class CreateFile1
{
	public static void main(String args[])throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		FileOutputStream fout=new FileOutputStream("myfile.txt",true);
		BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
		System.out.println("enter text(@the end):");
		char ch;
		while((ch=(char)dis.read())!='@')
		bout.write(ch);
		bout.close();
	}
}
	
