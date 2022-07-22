package exercises_testlesson05_05;

public class Exam05 {
	public static void main(String[] args) {
		General c1 = new Textbook("1", 1234, "chim", "new");
		General c2 = new Textbook("2", 1, "chim1", "new");
		General c3 = new Textbook("3", 1236, "chim2", "old");
		
		General c4 = new Referencebook("123", 456, "cu", 0.01f);
		General c5 = new Referencebook("124", 457, "cu2", 0.01f);
		
		General[] book = {c1,c2,c3,c4,c5};
		find("chim", book);
		find1(book);
		System.out.println(tinh(c1.price,c1.status,c4.price, c4.tax));
		
	}
	
	
	private static void find(String name, General[] book) {
		for(int i = 0; i< book.length; i++) {
			if(book[i].publisher == name) {
				System.out.println(book[i].toString());
			}
		}
	}
	private static void find1(General[] book) {
		for(int i = 0; i< book.length; i++) {
			if(book[i].price < 50) {
				System.out.println(book[i].toString());
			}
		}
	}
	
	private static float tinh(float price,String status,float price1, float tax) {
		
		return  price * ((status == "new") ? 1 : 0.7f) + price1*(1+tax/100);
		
	}	
}
