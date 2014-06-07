class MultiLevel
{
	public static void main(String args[])
	{
		Result r=new Result();
		r.get_info(2,"sangeetha");
		r.getMarks(93.5,98);
		r.display();
	}
}
/*
E:\JAVAprograms\Inheritance>javac Student1.java

E:\JAVAprograms\Inheritance>javac Test.java

E:\JAVAprograms\Inheritance>javac Result.java

E:\JAVAprograms\Inheritance>javac MultiLevel.java

E:\JAVAprograms\Inheritance>java MultiLevel
rno     2
name    sangeetha
sub1    93.5
sub2    98.0
Total marks     191.5

E:\JAVAprograms\Inheritance>

*/
