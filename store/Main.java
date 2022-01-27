package store;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import products.Appliance;
import products.Beverage;
import products.Clothes;
import products.Food;
import products.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Food f= new Food("apples","BrandA",1.5, strToDate("2021-06-14"));
		Beverage b= new Beverage("milk", "BrandM", 0.99, strToDate("2022-02-02"));
		Clothes c= new Clothes("T-shirt", "BrandT", 15.99, 'M', "violet");
		Appliance a= new Appliance("laptop", "BrandL", 2345, "Model L", strToDate("2021-03-03"), 1.125f);
		
		Cart cart= new Cart();
		cart.addItem(f, 2.45);
		cart.addItem(b, 3);
		cart.addItem(c, 2);
		cart.addItem(a, 1);
		
		f.getDiscount(strToTime("2021-06-14 12:34:56"));
		
		Cashier.printReceipt(cart, strToTime("2021-06-14 12:34:56"));
		
	}
	
	private static LocalDateTime strToTime(String string) {
		return LocalDateTime.parse(string, Product.formatterTime);
	}

	public static LocalDate strToDate(String x) {
		return LocalDate.parse(x, Product.formatterDate);
	}
	

}
