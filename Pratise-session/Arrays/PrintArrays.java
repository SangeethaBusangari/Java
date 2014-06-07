import java.io.*;
class PrintArrays
{
	public static void main(String args[]) throws IOException
	{
		int i=0;
		System.out.println("how many subjects numbers do you want to enter?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int marks[]=new int[n];
		System.out.println("enter "+ n + "subjects marks");
		for(i=0;i<n;i++)
			marks[i]=Integer.parseInt(br.readLine());
		for(i=0;i<n;i++)
			System.out.println("the entered Marks are" + marks[i]);	
	}
}
/*
E:\JAVAprograms\Arrays>java PrintArrays
how many subjects numbers do you want to enter?
4
enter 4subjects marks
22
44
55
66
the entered Marks are22
the entered Marks are44
the entered Marks are55
the entered Marks are66

E:\JAVAprograms\Arrays>
