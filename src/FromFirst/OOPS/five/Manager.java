package FromFirst.OOPS.five;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		Account acc_1 = new Account("Amaresh",4500);
		Account acc_2 = new Account("Dhoni",7000);
		Account acc_3 = new Account("Yash",8000);
		Account acc_4 = new Account("Ganesh",5000);
		Account acc_5 = new Account("KL rahul",1000);
		Account[] accounts = new Account[] {acc_1,acc_2,acc_3,acc_4,acc_5}; 
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1:Deposit 2:Withdraw 3:Balance 4:Exit");
			int choice = sc.nextInt();
			System.out.println("Enter the account number:");
			int acc_no = sc.nextInt();
			
			Account account = searchAccount(acc_no,accounts);
			if(account!=null)
			{
				switch(choice)
				{
				case 1:
					System.out.println("Enter the balance to deposit:");
					float amount = sc.nextFloat();
					account.deposit(amount);
					break;
				case 2:
					System.out.println("Enter the withdrawal amount:");
					float w_amount = sc.nextFloat();
					account.withdraw(w_amount);
					break;
				case 3:
					account.showBalance();
				case 4:
					System.exit(0);
				default:
					System.out.println("Please enter choice 1-4 only:");
				}
			}
				else
				{
					System.out.println("Enter valid account number.......");
				}
			
		}
		
	}
private static Account searchAccount(int acc_no,Account[] accounts)
{
	for(Account ac:accounts)
	{
		if(ac.acc_no==acc_no)
		{
			return ac;
		}
	}
	return null;
}
}
