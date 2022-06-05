package inheritance;
/*
 * Sách gồm id, name , price
 * ReferenceBook gồm Book và tax
 */
public class ReferenceBook extends Book {
	private double tax;
	
	public ReferenceBook() {
		
	}
	
	public ReferenceBook (String id, String name, double price)
	super.setId(id);
}
