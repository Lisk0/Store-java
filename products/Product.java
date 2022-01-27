package products;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
	protected String name;
	protected String brand;
	protected double price;
	
	public Product(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + brand+ " ";
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount(LocalDateTime current) {
		return -1;
	}
	
	public static DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static DateTimeFormatter formatterDate= DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
}
