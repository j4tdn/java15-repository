package inheritance;

public class BookApp {
	public static void main(String[] args) {
		Textbook tb1 = new Textbook("TB1", "Math 02", 100, "ND", Level.BASIC);
		Textbook tb2 = new Textbook("TB2", "Math 01", 120, "ND", Level.ADVANCE);

		ReferenceBook rf1 = new ReferenceBook("Rf1", "Math 01", 120, "ND", 10d);

		Book[] books = { tb1, tb2, rf1 };

		for (Book book : books) {

			// if (book.getClass() == ReferenceBook.class)
			if (book instanceof ReferenceBook) {
				ReferenceBook rb = (ReferenceBook) book;
				System.out.println("tax" + rb.getTax());
				// System.out.println("tax" + ((RefrenceBook) book).getTax());
			}
		}

		System.out.println(tb1);
		System.out.println(tb2);
		System.out.println(rf1);

	}
}
