package FromFirst.OOPS.five;
class One
{
	int i=10;
	void show()
	{
		System.out.println(i);
	}
}
class Two extends One
{
	int i=20;
	void show()
	{
		//System.out.println(super.i);
		super.show();
		System.out.println(i);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Two obj = new Two();
		obj.show();
	}

}
