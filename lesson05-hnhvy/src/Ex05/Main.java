package Ex05;

public class Main {
	public static void main(String[] args) {

		TextBook tb1 = new TextBook("SGK1", 20000, "Kim Đồng", "New");
		TextBook tb2 = new TextBook("SGK2", 10000, "Nhi đồng", "Old");
		TextBook tb3 = new TextBook("SGK3", 18000, "Thiếu nhi", "New");
		ReferBook rb1 = new ReferBook("STK1", 30000, "Nhi Đồng", 0.1);
		ReferBook rb2 = new ReferBook("STK2", 25000, "Kim Đồng", 0.2);

		Book[] books = {tb1, tb2, tb3, rb1, rb2};

		System.out.println("Toàn bộ sách thuộc nhà xuất bản Nhi Đồng: ");
		BookRequire.findNDBooks(books);
		
		
		System.out.println("toàn bộ sách có đơn giá nhỏ hơn 50:  ");
		BookRequire.findBooksLowerThan50(books);
		
		System.out.println("toàn bộ sách giáo khoa có đơn giá từ 100 đến 200");
		BookRequire.findBooks100to200(new TextBook[] {tb1, tb2,tb3});
	}

}