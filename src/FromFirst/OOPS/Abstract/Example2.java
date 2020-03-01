package FromFirst.OOPS.Abstract;
abstract class Plan
{
	protected double rate;
	public abstract void getRate();
	
	public void calculateBill(int units)
	{
		System.out.print("Bill amount for " + units +" units:" );
		System.out.println(rate*units);
	}
	
}
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate = 5.00;
	}
	
}
class DomesticPlan extends Plan
{
	public void getRate()
	{
		rate = 2.60;
	}
	
}
public class Example2 {
	public static void main(String[] args) {
		Plan p;
		p = new CommercialPlan();
		p.getRate();
		p.calculateBill(250);
		
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}

}
