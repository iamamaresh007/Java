package FromFirst.OOPS.Accounts;

public class SavingAccount extends Account {
	private float min_balance = 1000;

	public SavingAccount(String name, float balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (amount > (balance - min_balance)) {
			System.out.println("Sorry!U don't have sufficient fund....");
		} else {
			balance -= amount;
		}
		System.out.println("Current balance:" + balance);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Min balance  :" + min_balance);
	}

}
