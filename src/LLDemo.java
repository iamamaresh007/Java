import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

import javax.print.DocFlavor.STRING;

class LLDemo {
      public static void main(String[] args) throws NumberFormatException, IOException {
		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Amaresh");
		ll.add("Dhoni");
		ll.add("Yash");
		
		System.out.println("Linked list:" + ll);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String element;
		int position,choice=0;
		
		while(choice<4)
		{
			System.out.println("Linked List elements");
			System.out.println("1.Add element");
			System.out.println("2.Remove element");
			System.out.println("3.Change element");
			System.out.println("4.Exit");
			
			System.out.println("Enter your choice:");
			choice = Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				System.out.println("Enter element to be add:");
				element =br.readLine();
				System.out.println("At what position?");
				position = Integer.parseInt(br.readLine());
				ll.add(position-1,element);
				break;
			case 2:
				System.out.println("Enter position:");
				position = Integer.parseInt(br.readLine());
				ll.remove(position-1);
				break;
			case 3:
				System.out.println("Enetre position:");
				position =Integer.parseInt(br.readLine());
				System.out.println("Eneter elemnt to change:");
				element =br.readLine();
				ll.set(position-1,element);
				break;
				default: return;
			}
		System.out.println("List=\t");
		Iterator it =ll.iterator();
		while(it.hasNext())
			System.out.println(it.next()+" ");
			    
			
			}
			
			
			
		}
	}
	


