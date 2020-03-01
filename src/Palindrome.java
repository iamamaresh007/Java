
public class Palindrome {
	public static void main(String[] args) {
		int i,r,n=454,rev = 0;
		int t=n;
		while(n>0)
		{
			r=n%10;
			rev=(rev*10)+r;
			n=n/10;
			
		}
		if(t==rev)
		    System.out.println("Palindrome:");
		else
			System.out.println("not palin");
		
	}

}
