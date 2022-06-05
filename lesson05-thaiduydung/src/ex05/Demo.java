package ex05;

public class Demo {
	public static void main(String[] args) {
		Book b1 = new TextBook("TB01", 40, "Nhi Dong", true);
		Book b2 = new TextBook("TB02", 80, "Giao Duc", false);
		Book b3 = new ReferBook("RB01", 120, "Kim Dong", 0.2);
		Book b4 = new ReferBook("RB02", 150, "Nhi Dong", 0.5);

		BookManagement list = new BookManagement();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.findByPlaceOfPublication("Nhi Dong");
		list.findByPrice();
		list.findByPriceRange();
		list.totalOfMoney();

	}
}