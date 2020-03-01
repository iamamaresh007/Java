package Practice;
class Commercial
{
	private String name;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void calculateBill(int units)
	{
		System.out.println("Customer name:" + getName());
		System.out.println("Bill Amount:" + 5.00*units);
	}
}
class Domestic extends Commercial
{
	void calculateBill(int units)
	{
		System.out.println("Customer name:" + getName());
		System.out.println("Bill Amount:" + 2.50*units);
	}
	
}
public class ElectricityOverridden {
	public static void main(String[] args) {
		Commercial c = new Commercial();
		c.setName("Amaresh");
		c.calculateBill(150);
		
		Domestic d = new Domestic();
		d.setName("Dhoni");
		d.calculateBill(200);
	}

}
