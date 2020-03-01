import java.util.ArrayList;
import java.util.Iterator;

class ArrayListDemo {
	 public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Amaresh");
		al.add("Dhoni");
		al.add("Yash");
		al.add("Enemy");    //Adding
		al.add("Ganesh");
		al.add("Bad time");
		System.out.println("Array list after adding:" + al);
	    
		al.remove("Bad time");
		al.remove("Enemy");
		System.out.println("After removing" + al);
		
		System.out.println("Size:" +al.size());
		
		Iterator it =al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
