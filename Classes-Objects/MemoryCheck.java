class BasicBlob
{
	static int idcounter,population;
	protected int id;
	BasicBlob()
	{
		id=idcounter++;
		++population;
	}
	protected void finalize() throws Throwable
	{
		--population;
		super.finalize();
	}
}
class Blob extends BasicBlob
{
	int[] size;
	Blob(int bloatedness)
	{
		size=new int[bloatedness];
		System.out.println(id+":Hello");
	}
	protected void finalize()throws Throwable
	{
		System.out.println(id+":bye");
	}
}
	
public class MemoryCheck
{
	public static void main(String args[])
	{
		int blobRequired,blobsize;
		blobRequired=Integer.parseInt(args[0]);
		blobsize=Integer.parseInt(args[1]);
		System.err.println("Usage: Finalizers <number of blobs> <blobsize>");
		Runtime environment=Runtime.getRuntime();
		System.out.println("Total memory"+environment.totalMemory());
		System.out.println("free memory before creation"+environment.freeMemory());
		for(int i=1;i<=blobRequired;i++)
		{
			new Blob(blobsize);
		}
		System.out.println("free memory after blob creation"+environment.freeMemory());
		System.gc();
		System.out.println("free memory after GC "+environment.freeMemory());
		System.out.println(BasicBlob.population+"blobs alive");
	}
}
/*
E:\Classes&objects>javac MemoryCheck.java

E:\Classes&objects>java MemoryCheck 5 10000
Usage: Finalizers <number of blobs> <blobsize>
Total memory5177344
free memory before creation4917344
0:Hello
1:Hello
2:Hello
3:Hello
4:Hello
free memory after blob creation4717264
4:bye
3:bye
2:bye
1:bye
0:bye
free memory after GC 4820856
5blobs alive

E:\Classes&objects>*/
