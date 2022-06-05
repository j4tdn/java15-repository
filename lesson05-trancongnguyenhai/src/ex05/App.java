package ex05;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Tran Van Chien", "0905090009", "Da Nang");
		Customer c2 = new Customer("KH2", "Tran Van An", "0905090008", "Quang Nam");

		TextBook t1 = new TextBook("SGK01", 15, "Nha Nam", true);
		TextBook t2 = new TextBook("SGK02", 20, "Kim Dong", false);
		TextBook t3 = new TextBook("SGK03", 60, "Nhi Dong", false);

		ReferBook rf1 = new ReferBook("STK01", 100, "Nha Nam", 20);
		ReferBook rf2 = new ReferBook("STK02", 150, "Nhi Dong", 15);

		Book[] books = { t1, t2, t3, rf1, rf2 };
		
		BookUtils.Show(BookUtils.SearchNhiDong(books));
		System.out.println("======================================");
		BookUtils.Show(BookUtils.SearchPriceLeast50(books));
	}
}
