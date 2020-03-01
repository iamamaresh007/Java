package FromFirst.OOPS.six;

class MathOperations {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int... a) {
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		return sum;
	}

}

public class OverloadingExample {
	public static void main(String[] args) {
		MathOperations obj = new MathOperations();
		System.out.println(obj.add(10,45,89,278,4556));
	}
}
