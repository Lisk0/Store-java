package store;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import products.Product;
import store.Cart;

public class Cashier {
	
	private static final DecimalFormat df = new DecimalFormat("#.##");
	//private static final DecimalFormat dfTwoDecimals = new DecimalFormat("0.00");
	
	 public static void printReceipt(Cart cart, LocalDateTime time) {
		
		double totalCost=0;
		double totalDiscount=0;
		
		
		System.out.println("Date: " + time.format(Product.formatterTime));
		System.out.println();
		
		System.out.println("---Products---");
		System.out.println();
		
		int n= cart.getSize();
		for(int i=0; i<n; i++) {
			
			Product x= cart.getProductAt(i);
			System.out.println(x.toString());
			
			double ammount= cart.getQuantityAt(i);
			double cost= Double.valueOf(df.format(x.getPrice()* ammount));
			totalCost+= cost;
			
			String output= df.format(ammount) + " x $" + df.format(x.getPrice()) + " = $" +
					cost;
			
			System.out.println(output);
			
			double discount= x.getDiscount(time);
			
			if(discount>0) {
				double dsc= Double.valueOf(df.format(cost* discount));
				totalDiscount-= dsc;
				System.out.println("#discount "+ df.format(discount*100) + "% -$"+ dsc);
			}
			
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("SUBTOTAL: $" + df.format(totalCost));
		System.out.println("DISCOUNT: $" + df.format(totalDiscount));
		System.out.println();
		
		System.out.println("TOTAL: $" + df.format(totalCost+ totalDiscount));
	
	}
}
