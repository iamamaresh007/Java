package Practice;
class A
{
	static void calculate(double x)
	{
		System.out.println("Squre value=" + (x*x));
	}
}
class B extends A  //Method overloading
{
	 static void calculate(double x)
	{
	System.out.println("Squre root=" + Math.sqrt(x));
	}
	
}
public class Poly {
	public static void main(String[] args) {
		A obj = new B();
		obj.calculate(25);
	}

}
