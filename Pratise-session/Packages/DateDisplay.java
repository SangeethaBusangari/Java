import Mypack.DateImpl;
class DateDisplay
{
	public static void main(String args[])
	{
		DateImpl obj=new DateImpl();
		obj.showDate();
	}
}
/*

E:\JAVAprograms\packages>javac -d . MyDate.java

E:\JAVAprograms\packages>javac -d . DateImpl.java

E:\JAVAprograms\packages>javac DateDisplay.java

E:\JAVAprograms\packages>java DateDisplay
Mon Jun 17 22:05:26 IST 2013

E:\JAVAprograms\packages>*/
