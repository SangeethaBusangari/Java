class One
{
	void calculate(int x)
	{
		System.out.println("from base class"+ (x*x));
	}
}
/* cannot override static method....................... 
if we declare calculate method as static in One class.
E:\JAVAprograms\Polymorphism>javac Two.java
Two.java:3: calculate(int) in Two cannot override calculate(int) in One; overrid
den method is static
        void calculate(int x)
             ^
1 error
*/
//cannot override final method....
/*
if we declare calculate method as final in One class.
E:\JAVAprograms\Polymorphism>javac Two.java
Two.java:3: calculate(int) in Two cannot override calculate(int) in One; overrid
den method is final
        void calculate(int x)
             ^
1 error
*/
