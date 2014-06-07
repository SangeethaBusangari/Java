public class Maxamount extends Exception
{
	Maxamount(String cust_name,int amount)
	{
		super(cust_name+"is withdrawing money exceeded.. the limit is 200 and withdrawn amount is:"+amount);
	}
}
