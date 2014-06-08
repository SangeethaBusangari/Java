class SStatic
{
	public static void main(String[] ar)
	{
		int a=2,b=4,k;
		k=max(a,b);
		System.out.println("max value is"+ k);
	}
	public static int max(int x,int y)//public is not mandatory
	{
		if(x>y)
			return x;
		else
			return y;
	}
}
/*

E:\JAVAprograms\Methods>javac SStatic.java

E:\JAVAprograms\Methods>java SStatic
max value is4

E:\JAVAprograms\Methods>*/
