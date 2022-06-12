package library;

public class Application {
	public static void main(String[] args) {
		Customer cs1 = new Customer("123", "Alexander", 01234, "Downtown Street");
		TextBook tb1 = new TextBook("SGK01", 50000.0, "Nhi Đồng", Condition.New);
		TextBook tb2 = new TextBook("SGK02", 38000.0, "NXB Trẻ", Condition.Old);
		TextBook tb3 = new TextBook("SGK03", 150000.0, "Nhi Đồng", Condition.New);
		ReferenceBook rb1 = new ReferenceBook("STK01", 300000.0, "Nhi Đồng", 10.0);
		ReferenceBook rb2 = new ReferenceBook("STK02", 40000.0, "NXB Trẻ", 5.0);
		Book[] books = { tb1, tb2, tb3, rb1, rb2 };
		for (int i = 0; i < books.length; i++) {
		//	System.out.println(books[i]);
			
		}
		//OrderUtils.findPublisher(books);
		//OrderUtils2.findBookPrice(books);
		//OrderUtils3.findRefercenBook(books);        OrderDetail o1 = new OrderDetail(cs1, rb2, tb3);
        System.out.println(o1);
        System.out.println("Total money of this order :" + OrderUtils4.Sum(rb1, tb2));
	}

}
