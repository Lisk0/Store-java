package products;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Clothes extends Product{
	
	public Clothes(String name, String brand, float price, char size, String color) {
		super(name, brand, price);
		this.size = size;
		this.color = color;
	}

	private char size;
	private String color;
	
	public float getDiscount() {
		float discount;
		LocalDate current= LocalDate.now();
		DayOfWeek d= DayOfWeek.from(current);
		int value= d.getValue();
		if(value>=1 && value<=5)
			discount=0.1f;
		else discount= 0.0f;
		
		return discount;
	}

}
