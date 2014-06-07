abstract class Plan
{
	protected double rate;
		abstract void getRate();
		void calBill(int units)
		{
			System.out.println(" Bill amount is"+rate*units);
		}
}
