import java.io.*;
class GetObj
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fis=new FileInputStream("objfile.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		try
		{
			Employee e;
			while((e=(Employee)ois.readObject())!=null)
			{
				e.display();
			}
		}
		catch(EOFException ee)
		{
			System.out.println("End of file reached");
		}
		finally
		{
			ois.close();
		}
	}
}
/*
E:\Streams&Files>javac GetObj.java

E:\Streams&Files>java GetObj
1       sangeetha       200000.0        Thu Jun 27 14:31:08 GMT+05:30 2013
End of file reached

E:\Streams&Files>*/	
