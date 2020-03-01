package FromFirst;

import java.util.Scanner;

class Rectangle
{
	int leng;
	int bread;
	public Rectangle(int l,int b)
	{
		leng=l;
		bread=b;
	}
	public int getAreaa()
	{
		return leng*bread;
	}
}

public class AreaOfRect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lenght:");
		int l=sc.nextInt();
		
		System.out.println("Enetr breadth:");
		int b = sc.nextInt();
		
		Rectangle rt = new Rectangle(l,b);
		System.out.println("Area is:" + rt.getAreaa());
		
	}

}
