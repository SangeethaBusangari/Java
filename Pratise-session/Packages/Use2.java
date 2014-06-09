import Arithmetic.*;
import Arithmetic.Addition;
import Arithmetic.Subtraction;
public class Use2
{
	public static void main(String args[])
	{
		Addition obj=new Addition(17,3.2);
		obj.sum();
		double res=Subtraction.sub(14,3);
		System.out.println("Result of Subtraction"+ res);
	}
}
/*

E:\JAVAprograms\packages>javac -d . Addition.java

E:\JAVAprograms\packages>javac -d . Subtraction.java

E:\JAVAprograms\packages>javac Use2.java

E:\JAVAprograms\packages>java Use2
sum=    20.2
Result of Subtraction11.0

E:\JAVAprograms\packages>*/
