package products;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appliance extends Product{
	
	private String model;
	private LocalDate productionDate;
	private double weight;
	
	public Appliance(String name, String brand, double price, String model, LocalDate productionDate, double weight) {
		super(name, brand, price);
		this.model = model;
		this.productionDate = productionDate;
		this.weight = weight;
	}
	
	@Override
	public double getDiscount(LocalDateTime time) {
		double discount;
		DayOfWeek d= DayOfWeek.from(time);
		int value= d.getValue();
		if(price>999 && value>5) {
			discount=0.05;
		}
		else discount=0.0;
		return discount;
	}
	
	@Override
	public String toString() {
		return super.toString() + model;
	}
	
}
