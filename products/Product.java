package products;

public class Product {
	protected String name;
	protected String brand;
	protected float price;
	
	public Product(String name, String brand, float price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + brand+ " ";
	}

	public float getPrice() {
		return price;
	}

	public float getDiscount() {
		return -1f;
	}
	
	
}
