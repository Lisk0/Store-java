package store;

import java.util.ArrayList;

import products.Product;

public class Cart {
	private ArrayList<Product> items;
	private ArrayList<Float> quantity;
	
	public Cart(ArrayList<Product> items, ArrayList<Float> quantity) {
		super();
		this.items = items;
		this.quantity = quantity;
	}
	
	Product getProductAt(int position) {
		return items.get(position);
	}
	
	float getQuantityAt(int position) {
		return quantity.get(position);
	}
	
	int getSize() {
		return items.size();
	}
	
	public void addItem(Product a, float b) {
		int index= items.indexOf(a);
		if(index== -1 ) {
			items.add(a);
			quantity.add(b);
		}
		else {
			quantity.set(index, quantity.get(index)+ b);
		}
	}
	
	public void removeItem(Product a, float b) {
		quantity.remove(items.indexOf(a));
		items.remove(a);
	}
	
}
