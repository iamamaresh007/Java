package FromFirst.OOPS.Accounts;

import java.util.Scanner;

public class AccountManager {

	public static void main(String[] args) {
		Account[] accounts = new Account[1000];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("__________________________________");
		while (true) {
			System.out.println("1.Create 2.Withdraw 3.Deposit 4.Show Details 5.Reports 6.Exit");
			System.out.println("Enter ur choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Account account = acceptAndGetAccount();
				if (account != null) {
					accounts[count++] = account;
				}
				break;
			case 2:
				System.out.println("Enter the account number:");
				int accno = sc.nextInt();
				boolean is_found = false;
				for (int i = 0; i < count; i++) {
					Account acc = accounts[i];
					if (acc.getAcc_number() == accno) {
						System.out.println("Enter the amount to withdraw:");
						int amount = sc.nextInt();
						acc.withdraw(amount);
						is_found = true;
						break;
					}
				}
				if (!is_found)
					System.out.println("You enetred invalid account number....");
				break;
			case 3:
				System.out.println("Enter the account number:");
				int accno_d = sc.nextInt();
				boolean is_found_d = false;
				for (int i = 0; i < count; i++) {
					Account acc = accounts[i];
					if (acc.getAcc_number() == accno_d) {
						System.out.println("Enter the amount to deposit:");
						int amount = sc.nextInt();
						acc.deposit(amount);
						is_found_d = true;
						break;
					}
				}
				if (!is_found_d)
					System.out.println("You enetred invalid account number....");
				break;
			case 4:
				if (count == 0) {
					System.out.println("No..Accounts to be added!!!!");
				} else {
					for (int i = 0; i < count; i++) {
						Account obj = accounts[i];
						obj.showInfo();
						System.out.println("______________________________");
					}
				}
				break;
			case 5:
				printReports(accounts, count);
				break;
			case 6:
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter crct choice:");
				break;
			}

		}

	}

	private static void printReports(Account[] accounts, int count) {
		if (count == 0) {
			System.out.println("Sorry,accounts to be added........");
		} else {
			System.out.println("Savings acoounts:");
			int s_count = 0;
			float s_tot_amount = 0;
			for (int i = 0; i < count; i++) {
				Account acc = accounts[i];
				if (acc instanceof SavingAccount) {
					System.out.println(String.format("%d,%s,%f",acc.getAcc_number(),acc.getName().toUpperCase(),acc.getBalance()));
					s_tot_amount += acc.getBalance();
					s_count++;
					System.out.println("_____________________________");
				}
			}
			System.out.println("No. of saving accounts:" + s_count);
			System.out.println("Total amount          :" + s_tot_amount);

			System.out.println("Current acoounts:");
			int c_count = 0;
			float c_tot_amount = 0;
			for (int i = 0; i < count; i++) {
				Account acc = accounts[i];
				if (acc instanceof CurrentAccount) {
					System.out.println(String.format("%d,%s,%f",acc.getAcc_number(),acc.getName().toUpperCase(),acc.getBalance()));
					c_tot_amount += acc.getBalance();
					c_count++;
					System.out.println("_____________________________");
				}
			}
			System.out.println("No. of current accounts:" + c_count);
			System.out.println("Total amount           :" + c_tot_amount);
		}
	}

	private static Account acceptAndGetAccount() {
		Scanner sc = new Scanner(System.in);
		Account account = null;

		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Enter the amount:");
		float amount = sc.nextFloat();
		System.out.println("1.Savings 2.Current");
		int type = sc.nextInt();

		if (type == 1) {
			account = new SavingAccount(name, amount);

		} else if (type == 2) {
			account = new CurrentAccount(name, amount);
		} else {
			System.out.println("You entered invalid account type...");
		}

		return account;
	}
}
