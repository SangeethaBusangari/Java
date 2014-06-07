class Exp3
{
	public static void main(String args[])//throws IOException
	{
		Sample s=new Sample();
		s.accept();
		s.display();
	}
}
/*
E:\JAVAprograms\ExceptionHandling>javac Exp3.java
.\Sample.java:8: unreported exception java.io.IOException; must be caught or dec
lared to be thrown
                String name=br.readLine();
                                       ^
1 error

E:\JAVAprograms\ExceptionHandling>*/
