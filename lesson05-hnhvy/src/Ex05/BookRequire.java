package Ex05;

public class BookRequire {
	
		private BookRequire() {
		}

		public static void findNDBooks(Book[] books) {
			for (Book book : books) {
				if ("Nhi Đồng".equals(book.getPublishingCompany())) {
					System.out.println(book);
				}
			}
		}

		public static void findBooksLowerThan50(Book[] books) {
			for (Book book : books) {
				if (book.getPrice() < 50) {
					System.out.println(book);
				}
			}
		}

		public static void findBooks100to200(Book[] books) {
			for (Book book : books) {
				if (book.getPrice() >= 100 && book.getPrice() <= 200) {
					System.out.println(book);
				}
			}
		}
	}

