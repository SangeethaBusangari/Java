import java.io.*;
class BubbleSort
{
	public static void main(String args[])throws IOException
	{
		System.out.println("enter integers count \n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int num[]=new int[n];
		System.out.println("Enter"+n+ "Integers randomly");
		for(int i=0;i<n;i++)
			num[i]=Integer.parseInt(br.readLine());
		for(int np=0;np<n;np++)
		{
			for(int nx=np+1;nx<n;nx++)
			{
				if(num[np]>num[nx])
				{
					int temp=num[np];
					num[np]=num[nx];
					num[nx]=temp;
				}
			}
		}
		System.out.println("after sorting\n");
		for(int k=0;k<n;k++)
			System.out.println(num[k]);
	}
}	
