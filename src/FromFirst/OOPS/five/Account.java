package FromFirst.OOPS.five;

public class Account {
	int acc_no;
	String name;
	float balance;
	
	public Account(String name,float balance)
	{
		this.acc_no=IdGenerator.getId();
		this.name=name;
		this.balance=balance;
	}
	public void withdraw(float amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
		}
		else {
			System.out.println("Sorry,You don't have sufficient balance.....");
		}
		showBalance();
	}
	public void deposit(float amount)
	{
		balance=balance+amount;
		showBalance();
	}
	public void showBalance()
	{
		System.out.println("You are having balance of:" + balance);
	}
	
	public void showInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Account number:"+acc_no);
		System.out.println("Balance is:"+balance);
	}

}
