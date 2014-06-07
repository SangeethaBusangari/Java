import java.io.*;
class Sample1
{
	String name;
	void accept()throws IOException
	{	System.out.println("Enter your name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
	}
	void display()
	{
		System.out.println("Name"+name);
	}
}
