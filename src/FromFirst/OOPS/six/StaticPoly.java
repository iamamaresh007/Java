package FromFirst.OOPS.six;

class Three {
	static void calculate(double x) {
		System.out.println("Squre values:" + (x * x));
	}
}

class Four extends Three {
	static void calculate(double x) {

		System.out.println("Squre root:" + Math.sqrt(x));
	}
	
	

}

public class StaticPoly {
	public static void main(String[] args) {
		Three f = new Four();
		f.calculate(25);
	}

}
/*
 * Note:In Static Polymorphism,when static methods are overriden then JVM will
 * decide which method is to be executed depending on the reference type used to
 * call the method.
 * 
 * 
 * 
 * 
 * 
 */