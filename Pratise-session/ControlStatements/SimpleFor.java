class SimpleFor
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<=n;i++)
		System.out.println("Ascending order is" +i);
		for(int i=n;i>=0;i--)
		System.out.println("descending order is"+i);
		
	}
}
/*

E:\JAVAprograms\ControlStatements>java SimpleFor
i value is0
i value is1
i value is2
i value is3
i value is4
i value is5
i value is6
i value is7
i value is8
i value is9
i value is10
*/
