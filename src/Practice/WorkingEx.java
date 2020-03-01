package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class WorkingEx {
	static HashSet<String> hs = new HashSet<>();
	 static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
		while(true)
		{
			System.out.println("1:Add" + "\n" + "2:Remove" + "\n" + "3:Display"+"\n"+"4:Search"+"\n"+"5:Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the name:");
				 String name = sc.next();
				 add(name);
				 break;
			case 2:
				remove();
				break;
			case 3:
				display();
				break;
			case 4:
				search();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice:");
				break;
			}
		}
	}
	private static void search() {
		System.out.println("Enter name to be search:");
		String ele = sc.next();
		if(hs.contains(ele))
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
}
	static void display() {
		if(hs.isEmpty())
		{
			System.out.println("Set is empty");
		}
		else
		{
		  Iterator<String> it = hs.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		   System.out.println("----------------");
		}
	
		
	}
	private static void remove() {
		System.out.println("Enter ele to remove:");
       String ele = sc.next();
        hs.remove(ele);
		
	}
	private static void add(String name)
	{
		System.out.println("Enter Element:");
		//String ele = sc.next();
		hs.add(name);
	}

}
