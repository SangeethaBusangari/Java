import java.io.*;
class Sample2
{
	static void demo()
	{
		try
		{
			System.out.println("Inside Demo()");
			throw new NullPointerException("Exception data");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
