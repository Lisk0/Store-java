package products;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Appliance extends Product{
	
	private String model;
	private LocalDate productionDate;
	private float weight;
	
	public Appliance(String name, String brand, float price, String model, LocalDate productionDate, float weight) {
		super(name, brand, price);
		this.model = model;
		this.productionDate = productionDate;
		this.weight = weight;
	}
	
	public float getDiscount() {
		float discount;
		LocalDate current= LocalDate.now();
		DayOfWeek d= DayOfWeek.from(current);
		int value= d.getValue();
		if(price>999 && value>5) {
			discount=0.05f;
		}
		else discount=0.0f;
		return discount;
	}
	
	@Override
	public String toString() {
		return super.toString() + model + "\n";
	}
	
}
