package exercises_testlesson05_05;

public class Referencebook extends General {
	

	public Referencebook(String id, float price, String publisher, float tax) {
		super(id, price, publisher);
		super.tax = tax;
	}



	@Override
	public String toString() {
		return "Referencebook [tax=" + tax + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
