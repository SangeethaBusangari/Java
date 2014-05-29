class Dog1
{
	void bark(int dogchilds)
	{
		System.out.println("dog has"+ dogchilds+"childs");
	}
	void bark(String petname)
	{
		System.out.println("Dog name is"+petname);
	}
}
public class Dog
{
	public static void main(String args[])
	{
		Dog1 d=new Dog1();
		d.bark(2);
		d.bark("Scoopy");
	}
}
/*
E:\Classes&objects>javac Dog.java

E:\Classes&objects>java Dog
dog has2childs
Dog name isScoopy

E:\Classes&objects>*/
