package products;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Perishable extends Product{


	public Perishable(String name, String brand, float price, LocalDate expirationDate) {
		super(name,brand,price);
		this.expirationDate = expirationDate;
		setDiscount();
	}
	
	protected LocalDate expirationDate;
	
	protected void setDiscount() {
		LocalDate current= LocalDate.now();
		long daysBetween = ChronoUnit.DAYS.between(current, expirationDate);
		if(daysBetween==0)
			discount=0.5f;
		
		else if(daysBetween>0 && daysBetween<=5)
			discount=0.1f;
		else discount=0.0f;
	}
	
	
}
