import java.io.*;
class Pascal1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter no of rows for pascal traingle");
		int n=Integer.parseInt(br.readLine());
		int q=0;
		char binom='*';
		while(q<n)
		{
			for(int r=40-2*q;r>0;--r)//spaces for each row
			{
				System.out.printf(" ");
			}
			for(int x=0;x<=q;x++)//x->no of ele=row no(q)
			{
				if(x==0)
					binom='*';//every row contains first ele as 1
				else
					binom='*';
				System.out.printf("%5d",binom); //5d represents space between 2 ele in same row.
			}
			System.out.println();
			++q;
		}
		
	}
}
