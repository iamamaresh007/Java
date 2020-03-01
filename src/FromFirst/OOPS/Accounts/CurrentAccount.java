package FromFirst.OOPS.Accounts;

public class CurrentAccount extends Account {
	private float draft_balance = 10000;

	public CurrentAccount(String name, float balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(int amount) {
		if (amount <= (balance + draft_balance)) {
			this.balance -= amount;
		} else {
			System.out.println("Sorry!U don't have sufficient fund....");
		}
		System.out.println("Current balance:" + balance);
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("Over draft    :" + draft_balance);
	}

}
