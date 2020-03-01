import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		String temp;
		count = sc.nextInt();
		String str[] = new String[count]; //allocate count memory
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter names:");
	    
		for(int i=0 ;i<count;i++)
		{
			str[i]=sc1.nextLine();
		}
	
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(str[i].compareTo(str[j])>0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted string are:");
		
		for(int i=0;i<count-1;i++)
		{
			System.out.println(str[i] + " ");
		}
		System.out.println(str[count-1]);
		
	
	}

}
