class Recursion
{
	static long result;
	static long fact(int n)
	{
		if(n==1)
			return 1;
		else
		{
			result=fact(n-1)*n;
			return result;
		}
	}
}
