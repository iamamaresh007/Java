package FromFirst;

/*class Triangle{
	int a,b,c;
	public double getArea()
	{
		double s=(a+b+c)/2.0;
		return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	}
	public double getParameter()
	{
		return (a+b+c)/2.0;
		
	}
}

public class AreaOfTriangle {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.a=3;
		t.b=4;
		t.c=5;
		System.out.println(t.getArea());
		System.out.println(t.getParameter());
	}

}

*/

class Triangle    /*Finding area and perimeter of rectangle*/
{
	int length;
	int breadth;
	public Triangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	public int getArea()
	{
		return length*breadth;
	}
	
	public int getPerimeter()
	{
		return 2*(length+breadth);
	}
	
}

public class AreaOfTriangle
{
	public static void main(String[] args) {
		Triangle t = new Triangle(3,5);
		Triangle t1 = new Triangle(12,54);
		System.out.println("Area:" +t.getArea() + " Peri:" +t.getPerimeter());
		System.out.println("Area:" +t1.getArea() + " Peri:" +t1.getPerimeter());
		
	}
}