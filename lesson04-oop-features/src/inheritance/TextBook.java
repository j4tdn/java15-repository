package inheritance;

public class TextBook extends Book {
	private Level level;
	
	public TextBook() {
		
	}
 
	

	public Level getLevel() {
		return level;
	}



	public void setLevel(Level level) {
		this.level = level;
	}



	public TextBook(String id, String name, double price, String publisher, Level level) {
		super(id, name, price, publisher);
		this.level = level;
	}


	public TextBook(String id, String name, double price, String publisher) {
		super(id, name, price, publisher);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "TextBook [level=" + level + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
