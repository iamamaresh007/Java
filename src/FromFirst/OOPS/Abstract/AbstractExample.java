package FromFirst.OOPS.Abstract;

abstract class MyClass {
	abstract void calculate(double x);
}

class Sub1 extends MyClass {
	void calculate(double x) {
		System.out.println("Squre value:" + (x * x));
	}
}

class Sub2 extends MyClass {
	void calculate(double x) {
		System.out.println("Squre root:" + Math.sqrt(x));
	}
}

class Sub3 extends MyClass {
	void calculate(double x) {
		System.out.println("Cube value:" + (x * x * x));
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		Sub1 obj1 = new Sub1();
		Sub2 obj2 = new Sub2();
		Sub3 obj3 = new Sub3();
		
		obj1.calculate(3);
		obj2.calculate(4);
		obj3.calculate(5);
	}

}
