package store;

import java.util.ArrayList;

import products.Product;

public class Cart {
	private ArrayList<Product> items;
	private ArrayList<Double> quantity;
	
	public Cart() {
		this.items= new ArrayList<Product>();
		this.quantity= new ArrayList<Double>();
	}
	public Cart(ArrayList<Product> items, ArrayList<Double> quantity) {
		super();
		this.items = items;
		this.quantity = quantity;
	}
	
	Product getProductAt(int position) {
		return items.get(position);
	}
	
	double getQuantityAt(int position) {
		return quantity.get(position);
	}
	
	int getSize() {
		return items.size();
	}
	
	public void addItem(Product a, double b) {
		int index= items.indexOf(a);
		if(index== -1 ) {
			items.add(a);
			quantity.add(b);
		}
		else {
			quantity.set(index, quantity.get(index)+ b);
		}
	}
	
	public void removeItem(Product a, double b) {
		quantity.remove(items.indexOf(a));
		items.remove(a);
	}
	
}
