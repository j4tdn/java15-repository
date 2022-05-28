package inheritance;

public class BookApp {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("TB1", "Math 01", 120, "ND", Level.BASIC);
		TextBook tb2 = new TextBook("TB2", "Math 01", 120, "ND", Level.ADVANCE);

		RefrenceBook rf1 = new RefrenceBook("Rf1", "Math 01", 120, "ND", 10d);

		Book[] books = { tb1, tb2, rf1 };

		for (Book book : books) {

			// if (book.getClass() == ReferenceBook.class)
			if (book instanceof RefrenceBook) {
				RefrenceBook rb = (RefrenceBook) book;
				System.out.println("tax" + rb.getTax());
				// System.out.println("tax" + ((RefrenceBook) book).getTax());
			}
		}

		System.out.println(tb1);
		System.out.println(tb2);
		System.out.println(rf1);

	}
}
