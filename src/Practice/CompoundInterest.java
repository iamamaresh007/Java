package Practice;

class CompoundInterest {
	public void calculate(double p,int n,double r)
	{
		double amount = p * Math.pow(1+r/100,n);
		double ci = amount - p;
		System.out.println("Compound Interest:" + ci);
	}
	public static void main(String[] args) {
		CompoundInterest obj = new CompoundInterest();
		obj.calculate(7800,3,5);
	}
	

}
