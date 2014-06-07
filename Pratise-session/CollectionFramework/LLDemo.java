import java.io.*;
import java.util.*;
class LLDemo
{
	public static void main(String args[])throws IOException
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		System.out.println("List="+ll);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position,choice=0;
		while(choice<4)
		{
			System.out.println("Linked List Operations\n");
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.change an element");
			System.out.println("4.exit");
			System.out.println("enter yout choice:");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: System.out.println("enter an element");
						element=br.readLine();
						System.out.println("At what position?");
						position=Integer.parseInt(br.readLine());
						ll.add(position-1,element);
						break;
						
				case 2: System.out.println("enter position:");
						position=Integer.parseInt(br.readLine());
						ll.remove(position-1);
						break;
						
				case 3: System.out.println("enter position:");
						position=Integer.parseInt(br.readLine());
						System.out.println("enter new element:");
						element=br.readLine();
						ll.set(position-1,element);
						break;
				default:return;
			}
			System.out.println("List=");
			Iterator it=ll.iterator();
			while(it.hasNext())
				System.out.println(it.next()+"");
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>java LLDemo
List=[America, India, Japan]
Linked List Operations

1.Add an element
2.Remove an element
3.change an element
4.exit
enter yout choice:
1
enter an element
43
At what position?
1
List=
43
America
India
Japan
Linked List Operations

1.Add an element
2.Remove an element
3.change an element
4.exit
enter yout choice:
1
enter an element
sangeetha
At what position?
4
List=
43
America
India
sangeetha
Japan
Linked List Operations

1.Add an element
2.Remove an element
3.change an element
4.exit
enter yout choice:
3
enter position:
5
enter new element:
china
List=
43
America
India
sangeetha
china
Linked List Operations

1.Add an element
2.Remove an element
3.change an element
4.exit
enter yout choice:
2
enter position:
2
List=
43
India
sangeetha
china
Linked List Operations

1.Add an element
2.Remove an element
3.change an element
4.exit
enter yout choice:
4

E:\JAVAprograms\CollectionFramework>*/			
