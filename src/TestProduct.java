
class Product{
	String prodCode; //Instance Variable
	String prodName;
	double prodPrice;
	
	public Product()
	{
	}
	
	public Product(String c,String n,double p)
	{
		prodCode=c;
		prodName=n;
		prodPrice=p;
	}
	void display() {
		System.out.println("Product code:" + prodCode);
		System.out.println("Product Name:" + prodName);
		System.out.println("Product Price:" + prodPrice);
	}
}
	public class TestProduct
	{
		public static void main(String[] args) {
			int arr[] =new int[5];
			
			arr[0]=1;
			arr[1]=2;
			System.out.println("Array[0]:" + arr[0]);
			System.out.println("Array[1]:" + arr[1]);
			
			
			Product[] p1 =new Product[5];
			p1[0]=new Product("hi","11",100.0);
			p1[0].display();
			Product p2 = new Product("AAA","A",10000.0);
			p2.display();
		
			}
	}
		
	
