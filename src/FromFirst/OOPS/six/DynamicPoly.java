package FromFirst.OOPS.six;

class One {
	void calculate(double x) {
		System.out.println("Squre values:" + (x * x));
	}

}

class Two extends One {
	void calculate(double x) {
		// super.calculate(x);
		System.out.println("Squre root:" + Math.sqrt(x));
	}

}

public class DynamicPoly {
	public static void main(String[] args) {
		Two t = new Two();
		t.calculate(25);
	}

}
/*
 * Note:In Dynamic poly,when super class is overridden by the sub class method,
 * then JVM will only call the sub class methods,not super class method. To call
 * the super class method we can use "Super" keyword.
 * 
 * 
 * 
 */
