import java.io.*;
import java.util.Date;
class Employee  implements Serializable
{
	private int id;
	private String name;
	private float sal;
	private Date doj;
	Employee(int i,String n,float s,Date d)
	{
		id=i;
		name=n;
		sal=s;
		doj=d;
	}
	void display()
	{
		System.out.println(id+"\t"+name+"\t"+sal+"\t"+doj);
	}
	static Employee getData()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee id");
		int id=Integer.parseInt(br.readLine());

		System.out.println("Enter Name");
		String name=br.readLine();

		System.out.println("Enter Salary");
		float sal=Float.parseFloat(br.readLine());

		Date d=new Date();

		Employee e=new Employee(id,name,sal,d);
		return e;
	}
}
	
