package FromFirst.TypeCasting.Wrapper;

public class WrapperClass {
	public static void main(String[] args) {
		Integer i = 100;   //Boxing
		int a = i;        //UnBoxing
		System.out.println(i);
		System.out.println(a);
		Integer num1 = new Integer(1001);
		Integer num2 = new Integer(1001);
		System.out.println(num1==num2);
		System.out.println(num1.equals(num2));
		
		int num3 = num1;
		int num4 = num2;
		
		System.out.println(num3==num4);
		System.out.println(num1.equals(num2));
		
	}

}
