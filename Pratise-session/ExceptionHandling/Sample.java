import java.io.*;
class Sample
{
	String name;
	void accept()
	{	System.out.println("Enter your name");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name=br.readLine();
	}
	void display()
	{
		System.out.println("Name"+name);
	}
}
	
