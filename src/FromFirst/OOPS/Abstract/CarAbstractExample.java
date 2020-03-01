package FromFirst.OOPS.Abstract;
abstract class Car
{
	int regno;
	Car(int r)
	{
		regno=r;
	}
	void openTank()
	{
		System.out.println("Fill the tank.....");
	}
	//Very will have different steering that's why abstract method is used.
	//And also brakes
	abstract void steering(int direction,int angle);
	abstract void braking(int force);
}
class Maruthi extends Car
{
	Maruthi(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn...");
		System.out.println("This is a ordinary steering...");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied.");
		System.out.println("These are hydralic brakings");
	}
}
class Santro extends Car
{
	Santro(int regno)
	{
		super(regno);
	}
	void steering(int direction,int angle)
	{
		System.out.println("Take a turn...");
		System.out.println("This car uses power steering...");
	}
	void braking(int force)
	{
		System.out.println("Brakes applied.");
		System.out.println("These are gas brakings");
	}
}

public class CarAbstractExample {
	public static void main(String[] args) {
		Maruthi m = new Maruthi(4935);
		Santro s = new Santro(7777);
		
		Car ref;
		ref=m;
		ref.openTank();
		ref.steering(1,900);
		ref.braking(500);
		
		System.out.println("________________________________");
		ref=s;
		ref.openTank();
		ref.steering(1,900);
		ref.braking(500);
		
		
	}

}
