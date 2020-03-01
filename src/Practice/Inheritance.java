package Practice;
class Calculator
{
	public int add(int i,int j)
	{
		return i + j;
	}
}

class CalAdv extends Calculator
{
	public int Sub(int i,int j)
	{
		return i-j;
	}
	
}

public class Inheritance {
	public static void main(String[] args) {
		
		CalAdv obj = new CalAdv();
		int result1=obj.add(10,20);
		int result2=obj.Sub(50,20);
		System.out.println(result1);
		System.out.println(result2);
	}

}
