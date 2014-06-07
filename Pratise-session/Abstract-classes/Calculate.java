class Calculate
{
	public static void main(String args[])
	{
		Plan p;
		p=new CommercialPlan();
		p.getRate();
		p.calBill(250);
		
		p=new DomesticPlan();
		p.getRate();
		p.calBill(150);
	}
}
/*

E:\JAVAprograms\AbstractClasses>java Calculate
 Bill amount is1250.0
 Bill amount is375.0

E:\JAVAprograms\AbstractClasses>
*/
