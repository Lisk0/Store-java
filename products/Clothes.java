package products;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clothes extends Product{
	
	private char size;
	private String color;
	
	public Clothes(String name, String brand, double price, char size, String color) {
		super(name, brand, price);
		this.size = size;
		this.color = color;
	}
	@Override
	public double getDiscount(LocalDateTime time) {
		double discount;
		LocalDate current= time.toLocalDate();
		DayOfWeek d= DayOfWeek.from(current);
		int value= d.getValue();
		if(value>=1 && value<=5)
			discount=0.1;
		else discount= 0.0;
		
		return discount;
	}

	@Override
	public String toString() {
		return super.toString() + size + " " + color;
	}

}
