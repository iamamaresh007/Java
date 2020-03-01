package FromFirst.OOPS.four;
class Shape
{
	static String color="yellow";
	static
	{
		System.out.println("Static block-1");
	}
	public Shape()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB-1");
	}
	static
	{
		System.out.println("Static block-2");
	}
}

public class StaticAndInstanceBlocks {
	public static void main(String[] args) {
		//Shape s = new Shape();
		System.out.println(Shape.color);
		Shape circle = new Shape();
	}

}
