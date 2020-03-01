class Amar
{
	int money;
	private int pocketMoney;
	void fill(int money,int pocketMoney)
	{
		this.money=money;
		this.pocketMoney=pocketMoney;
	}
	public int getPocketMoney()
	{
		return pocketMoney;
	}
}
class Big extends Amar
{
	int total;
	void sum()
	{
		total=money+ getPocketMoney();
	}
}

class InheritAccess {
	public static void main(String[] args) {
		
		Big subob = new Big();
		subob.fill(10, 12);
		subob.sum();
		System.out.println("Total:"+subob.total);
	}

}
