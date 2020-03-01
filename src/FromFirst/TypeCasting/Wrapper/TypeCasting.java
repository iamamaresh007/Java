package FromFirst.TypeCasting.Wrapper;

class A
{
	int a = 100;
	A(int a)
	{
		this.a=a;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof A)
		{
			A ob = (A)obj;
			return ob.a == this.a;
		}
		return false;
	}
}
public class TypeCasting {
	public static void main(String[] args) {
		int a = 700;
		float b = a;
		System.out.println(a);
		System.out.println(b);
		
		float c = 123.00f;
		int d = (int)c;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("________________________________");
		A obj1 = new A(10);
		A obj2 = new A(10);
		A obj3 = obj1;
		System.out.println(obj1 == obj3);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
