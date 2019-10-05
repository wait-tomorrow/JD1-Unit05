package by.htp.BasicOOP.Task02;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Item> items;

    public Payment() {
	items = new ArrayList<Item>();
    }

    public void add(String name, double price) {
	items.add(new Item(name, price));
    }

    public List<Item> getItems() {
	return items;
    }

    public void setItems(List<Item> items) {
	this.items = items;
    }

    @Override
    public String toString() {
	return "Payment [items=" + items + "]";
    }

    class Item {
	private double price;
	private String itemName;

	public Item(String itemName, double price) {
	    this.price = price;
	    this.itemName = itemName;

	}

	public double getPrice() {
	    return price;
	}

	public void setPrice(double price) {
	    this.price = price;
	}

	public String getItemName() {
	    return itemName;
	}

	public void setItemName(String itemName) {
	    this.itemName = itemName;
	}

	@Override
	public String toString() {
	    return "Item [price=" + price + ", itemName=" + itemName + "]";
	}
    }
}