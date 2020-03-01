package FromFirst.OOPS.Accounts;

public class Account {
	int acc_number;
	String name;
	float balance;
	public Account(String name, float balance) {
		if(acc_number==0)
		{
			acc_number = IdGenerator.getId();
		}
		this.name = name;
		this.balance = balance;
	}
	public void withdraw(int amount)
	{
		if(amount>=balance)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Sorry!You don't have sufficient balance....");
		}
		
	}
	public void deposit(int amount)
	{
		balance +=amount;
		System.out.println("Current balance:"+balance);
	}
	public void showInfo()
	{
		System.out.println("Account number:"+acc_number);
		System.out.println("Name          :" + name);
		System.out.println("Balance       :"+balance);
	}
	public int getAcc_number() {
		return acc_number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

}
