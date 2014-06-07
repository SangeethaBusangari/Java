import java.io.*;
import java.util.*;
class StackDemo
{
	public static void main(String args[])throws IOException
	{
		Stack<Integer> st=new Stack<Integer>();
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int position,element,choice=0;
		while(choice<5)
		{
			System.out.println("Stack Operations\n");
			System.out.println("1.push an element");
			System.out.println("2.pop an element");
			System.out.println("3.search an element");
			System.out.println("4.peek an element");
			System.out.println("5.exit");
			System.out.println("enter yout choice:");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1: System.out.println("enter an element");
						element=Integer.parseInt(br.readLine());
						st.push(element);
						break;
						
				case 2: Integer obj=st.pop();
						System.out.println("popped="+obj);
						break;
						
				case 3: System.out.println("which element do you want to search:");
						element=Integer.parseInt(br.readLine());
						position=st.search(element);
						if(position==-1)
						System.out.println("element not found");
						else
						System.out.println("element at position"+position);
						break;
				case 4:Integer obj1=st.peek();
						System.out.println("peek element"+obj1);
						break;
				default:return;
			}
			System.out.println("Stack contents:"+st);
			
		}
	}
}
/*
E:\JAVAprograms\CollectionFramework>javac StackDemo.java

E:\JAVAprograms\CollectionFramework>java StackDemo
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
1
enter an element
23
Stack contents:[23]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
1
enter an element
45
Stack contents:[23, 45]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
1
enter an element
76
Stack contents:[23, 45, 76]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
4
peek element76
Stack contents:[23, 45, 76]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
3
which element do you want to search:
76
element at position1
Stack contents:[23, 45, 76]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
3
which element do you want to search:
45
element at position2
Stack contents:[23, 45, 76]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
3
which element do you want to search:
23
element at position3
Stack contents:[23, 45, 76]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
2
popped=76
Stack contents:[23, 45]
Stack Operations

1.push an element
2.pop an element
3.search an element
4.peek an element
5.exit
enter yout choice:
5

E:\JAVAprograms\CollectionFramework>*/
