package FromFirst.TypeCasting.Wrapper;
//Day 31
class One
{
	int num = 10;
	void m1()
	{
		System.out.println("One m1");
	}
}
class Two extends One
{
	int num = 20;
	void m1()
	{
		System.out.println("Two m1");
	}
	void m2()
	{
		System.out.println("Two m2");
	}

}
public class TypeCaseReferenceVariables {
	public static void main(String[] args) {
		One obj = new Two();
		Two ob = (Two)obj;
		ob.m1();
		ob.m2();
		System.out.println(ob.num);
		obj.m1();
		System.out.println(obj.num);
		
	}
	

}
