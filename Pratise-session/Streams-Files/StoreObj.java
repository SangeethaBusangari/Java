import java.io.*;
import java.util.*;
class StoreObj
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos=new FileOutputStream("objfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		System.out.println("How many objects?");
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			Employee e1=Employee.getData();
			oos.writeObject(e1);
		}
		oos.close();
	}
}
/*
E:\Streams&Files>java StoreObj
How many objects?
1
Enter employee id
1
Enter Name
sangeetha
Enter Salary
200000
*/	
