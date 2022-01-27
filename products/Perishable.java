package products;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Perishable extends Product{
	
	protected LocalDate expirationDate;

	public Perishable(String name, String brand, double price, LocalDate expirationDate) {
		super(name,brand,price);
		this.expirationDate = expirationDate;
	}
	
	@Override
	public double getDiscount(LocalDateTime current) {
		double discount;
		LocalDate date=current.toLocalDate();
		long daysBetween = ChronoUnit.DAYS.between(date, expirationDate);
		if(daysBetween==0)
			discount=0.5f;
		
		else if(daysBetween>0 && daysBetween<=5)
			discount=0.1f;
		else discount=0.0f;
		
		return discount;
	}
	
	
}
