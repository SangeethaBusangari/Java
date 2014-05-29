import java.io.*;
class ByteDemo
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number1");
		String s1=br.readLine();
		Byte b1=new Byte(s1);
		System.out.println("enter any number2");
		String s2=br.readLine();
		Byte b2=new Byte(s2);
		int n=b1.compareTo(b2);
		if(n==0)
			System.out.println("both are same");
		else if(n<0)
			System.out.println("b1 is less");
		else
			System.out.println("b2 is less");
		
	}
}
/*
E:\WrapperClasses>javac ByteDemo.java

E:\WrapperClasses>java ByteDemo
enter any number1
3
enter any number2
3
both are same

E:\WrapperClasses>java ByteDemo
enter any number1
6
enter any number2
3
b2 is less

E:\WrapperClasses>java ByteDemo
enter any number1
3
enter any number2
8
b1 is less

E:\WrapperClasses>*/	
