import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) throws NumberFormatException, IOException {
		Stack<Integer> st = new Stack<>();
		int choice=0;
		int element,position;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 while(choice<4)
		 {
			 System.out.println("Stack Operations:");
			 System.out.println("1.PUSH");
			 System.out.println("2.POP");
			 System.out.println("3.Search");
			 System.out.println("4.Exit");
			 System.out.println("Enter ur choice");
			 
			 choice = Integer.parseInt(br.readLine());
			 switch(choice) {
			 case 1:
				 System.out.println("Enter ele to be psuh");
			     element =Integer.parseInt(br.readLine());
			     st.push(element);
			     break;
			 case 2:
				 Integer obj = st.pop();
				 System.out.println("Popped="+obj);
				 break;
			 case 3:
				 System.out.println("Enter ele to search");
			     element =Integer.parseInt(br.readLine());
			     position = st.search(element);
			     if(position==-1)
			    	 System.out.println("Element not found");
			     else
			    	 System.out.println("Position:"+position);
			     break;	 
			 default:
			        break;
			  
				 
			 }
			 System.out.println("Stack contains:" + st);
		 }
		
		
	}

	private int search(int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	private Integer pop() {
		// TODO Auto-generated method stub
		return null;
	}

	private void push(int element) {
		// TODO Auto-generated method stub
		
	}

}
