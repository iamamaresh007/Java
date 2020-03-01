
class Method {
	double num1,num2;
	public Method(int i, double d) {
		// TODO Auto-generated constructor stub
	}
	double sum() {
		double res = num1+num2;
		return res;
	}
	static class methods{
		public static void main(String args[])
		{
			Method m = new Method(10,22.5);
			double z = m.sum();
			Object res;
			System.out.println(z);
			
		}
	}

}
