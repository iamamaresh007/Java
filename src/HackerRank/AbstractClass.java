package HackerRank;

import java.util.Scanner;

abstract class book
{
	String title;
	abstract void setTitle(String s);
	
	String getTitle()
	{
		return title;
	}
	
}
class MyBook extends book
{
	void setTitle(String s)
	{
		title=s;
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		MyBook b = new MyBook();
		b.setTitle(title);
		System.out.println("The Title is:" + b.getTitle());
	}

}
