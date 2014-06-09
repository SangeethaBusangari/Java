import java.io.*;
class CopyFile
{
	public static void main(String args[])throws IOException
	{
		int ch;
		FileInputStream fin=new FileInputStream(args[0]);
		FileOutputStream fout=new FileOutputStream(args[1]);
		
		while((ch=fin.read())!=-1)
		fout.write(ch);
		fin.close();
		fout.close();
		System.out.println("1 file copied");

	}
}
	
