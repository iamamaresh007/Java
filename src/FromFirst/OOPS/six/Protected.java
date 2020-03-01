package FromFirst.OOPS.six;
class Access
{
	private int a=20;
	protected int b=30;
}
class Sub extends Access
{
	public void get()
	{
		//System.out.println(a); //error- a is private
		System.out.println(b);
	}
}
public class Protected {
	Sub s = new Sub();
	//s.get();

}
