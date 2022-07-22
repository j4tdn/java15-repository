package exercises_testlesson05_05;

public class Textbook extends General {
	

	public Textbook(){
		
	}
	
	
	
	public Textbook(String id, float price, String publisher, String status) {
		super(id, price, publisher);
		super.status = status;
	}



	@Override
	public String toString() {
		return "textbook [status=" + status + ", id=" + id + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
}
