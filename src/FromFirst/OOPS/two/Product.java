package FromFirst.OOPS.two;

public class Product {
	private int id;
	private String name;
	private String brand;
	private float price;

	public Product(int id, String name) {
		this(id, name, "not privided");
	}

	public Product(int id, String name, String brand) {
		this(id, name, brand, 0);
	}

	public Product(int id, String name, String brand, float price) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public void showInfo() {
		System.out.println(String.format("%d,%s,%s,%f", id, name, brand, price));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price < 0) {
			throw new IllegalArgumentException("Sorry,price can't be negative number");
		}
		this.price = price;
	}

}
