package HackerRank;

class Bicycle
{
	String def_Name()
	{
		return "a vehicle with pedals";
	}
}

class MotorCycle extends Bicycle
{
	String def_Name()
	{
		return "a cycle with an engine";
	}
	MotorCycle()
	{
		System.out.println("Hello i am a motorcycle,I am" + def_Name());
		String temp = super.def_Name();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}


public class MethodOverriding2 {
	public static void main(String[] args) {
		MotorCycle m = new MotorCycle();
	
	}

}
