package ch02.ex15;

import java.util.ArrayList;

public class Invoice {
	private ArrayList<Item> items = new ArrayList<>();

	private static class Item {
		String description;
		int quantity;
		double unitPrice;

		Item(String description, int quantity, double unitPrice) {
			this.description = description;
			this.quantity = quantity;
			this.unitPrice = unitPrice;
		}

		void print() {
			System.out.println("  Item:");
			System.out.println("    Description: " + description);
			System.out.println("    Quantity: " + quantity);
			System.out.println("    Unit Price: $" + unitPrice);
			System.out.println("    Total Price: $" + totalPrice());
		}

		double totalPrice() {
			return unitPrice * quantity;
		}
	}

	public void print() {
		double grandTotal = 0;
		System.out.println("Invoice Items:");
		for (Item item : items) {
			item.print();
			grandTotal += item.totalPrice();
		}
		System.out.printf("Invoice GrandTotal: $%.2f", grandTotal);
	}

	public void add(String description, int quantity, double unitPrice) {
		items.add(new Item(description, quantity, unitPrice));
	}

}
