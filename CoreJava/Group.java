/*1.Write a program to store a group of objects in to an array and retrieve the object data and display.*/
//To store and a group of objects in an arrAy
import java.io.*;
class Employee
{
      //instance vars
    int id;
    String name;
    //to store data
    Employee(int i,String n)
	{
		id=i;
		name=n;
	}
    //a method to display data 
	void displayData()
	{
		System.out.println(id+"\t"+name);
	}
} 
class Group
{
	public static void main(String args[ ]) throws IOException
	{
		//to accept data from keyboard
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//create Employee type array with size 5
		Employee arr[ ]=new Employee[5];
		//store 5 employees’data in to the array
		for(int i=0;i<5;i++)
		{
			System.out.println("enter id:");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter name:");
			String name=br.readLine();
			arr[i]=new Employee(id,name);
		}
		System.out.println("\nThe employee data is:");
		//display the employee data from the array
		for(int i=0; i<arr.length; i++)
		{
			arr[i].displayData();
		}
	}
}
/*
/*output

E:\UOHJAVAassignments\SE LAB>javac Group.java

E:\UOHJAVAassignments\SE LAB>java Group
enter id:
1
enter name:
sangeetha
enter id:
2
enter name:
sindhu
enter id:
3
enter name:
gowthami
enter id:
4
enter name:
thanu
enter id:
5
enter name:
vaishali

The employee data is:
1       sangeetha
2       sindhu
3       gowthami
4       thanu
5       vaishali

E:\UOHJAVAassignments\SE LAB>*/
*/
