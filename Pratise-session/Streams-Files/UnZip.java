import java.io.*;
import java.util.zip.*;
class UnZip
{
	public static void main(String args[])throws IOException
	{
		FileInputStream fis=new FileInputStream("file1.txt");
		FileOutputStream fos=new FileOutputStream("file2.txt");
		InflaterInputStream iis=new InflaterInputStream(fis);
		int data;
		while((data=iis.read())!=-1)
			fos.write(data);
		fos.close();
		iis.close();
	}
}
