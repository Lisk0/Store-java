package store;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import products.Product;

public class Cashier {
	
	void printReceipt(Cart cart, LocalDateTime time) {
		
		float totalCost=0;
		float totalDiscount=0;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Date: " + time.format(formatter));
		System.out.println();
		
		System.out.println("---Products---");
		System.out.println();
		
		int n= cart.getSize();
		for(int i=0; i<n; i++) {
			Product x= cart.getProductAt(i);
			float ammount= cart.getQuantityAt(i);
			float cost= x.getPrice()* ammount;
			String output= ammount + " x " + x.getPrice() + " = $" +
					cost;
			
			System.out.println(output);
			
			float discount= x.getDiscount();
			
			if(discount>0) {
				float dsc= cost* discount;
				totalDiscount-= dsc;
				System.out.println("#discount "+ discount*100 + "% -"+ dsc);
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("SUBTOTAL: $" + totalCost);
		System.out.println("DISCOUNT: $" + totalDiscount);
		System.out.println();
		
		System.out.println("TOTAL: $" + (totalCost+ totalDiscount));
	
	}
}
