package titv;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(12, 9, 1985);
		Date date2 = new Date(2, 10, 1995);
		Date date3 = new Date(4, 4, 1994);
		Date date4 = new Date(6, 9, 1274);
		
		Author author1 = new Author("HO MANH BAO", date1);
		Author author2 = new Author("QUYNH QUANG QUAN", date2);
		Author author3 = new Author("BANH CONG TRU", date3);
		Author author4 = new Author("CAO TUNG BACH", date4);
		
		Book book1 = new Book("Con Chim Mồ Côi", 2300000, 1994, author1);
		Book book2 = new Book("Người Đua Diều", 400000, 2012, author2);
		Book book3 = new Book("Người Lái Đò Sông Đà", 550000, 2000, author3);
		Book book4 = new Book("Bên Kia Đại Dương", 264000, 2019, author4);
		
		
		
//		System.out.println("book1 and book3: "+book1.compareYear(book2));
//		System.out.println("book2 and book4: "+book2.compareYear(book4));
//		
//		System.out.println("Affter Discout : "+book1.afterDiscout(15));
//		System.out.println("Affter Discout book2: "+book2.afterDiscout(15));
//		System.out.println("Affter Discout book3: "+book3.afterDiscout(15));
//		System.out.println("Affter Discout book4: "+book4.afterDiscout(15));
		
	}

}
