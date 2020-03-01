class F
{
	int i;
	F(int x)
	{
		i=x;
	}
}
class G extends F
{
	int j;
	G(int x,int y)
	{
		super(x);   //immediate parent constructor 
		j=y;
	}
	 G()  //To call the same constructor use this.
	{
		this(0,0);   //it should be first constructor 
	}
	public void display()
	{
		System.out.println(i +" "+ j);
	}
	
class H extends G
{
	
}
public class TestProdct {

	public void main(String[] args) {
		final int i=1; //constant i
		i=10;
		i=12;
		F a; //= new F();
		G b; //=new G();
		H c = new H();
		//b.display();

	}
} 

}
