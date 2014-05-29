/*
Using this keyword for accessing the instance variables. (Instance Variable Hiding)
*/
class thisInit
{
	int noOfWatts;
	boolean indicator;
	String location;
	thisInit(int noOfWatts,boolean indicator,String site)
	{
		String location;
		this.noOfWatts=noOfWatts;
		this.indicator=indicator;
		location=site;
		this.superflous();
	}
	void superflous()
	{
		System.out.println(this);
	}
	public static void main(String args[])
	{
		thisInit t=new thisInit(100,false,"Hereonly");
		System.out.println("noOfWatts "+ t.noOfWatts);
		System.out.println("indicator "+ t.indicator);
		System.out.println("location "+ t.location);
	}
}
/*
E:\Classes&objects>javac thisInit.java

E:\Classes&objects>java thisInit
thisInit@3e25a5
noOfWatts 100
indicator false
location null*/
