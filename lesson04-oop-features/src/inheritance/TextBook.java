package inheritance;

public class TextBook extends Book {
	private Level level;
	 public TextBook() {
		 
	 }
	public TextBook(String id, String name, double price, String publisher, Level level) {
		super(id, name, price, publisher);
		this.level = level;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "TextBook [level=" + level + ", toString()=" + super.toString() + "]";
	}
	
	
	 

}
