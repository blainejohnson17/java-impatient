package ch02.ex15;

public class InvoiceDemo {

	public static void main(String[] args) {
		Invoice invoice = new Invoice();
		invoice.add("Computer Monitor", 2, 199.27);
		invoice.add("Computer Mouse", 1, 27.99);
		invoice.print();
	}

}
