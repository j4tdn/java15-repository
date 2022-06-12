package inheritance;

public class Textbook extends Book {
  private Level level;
  
  public Textbook(String id , String name , double price , String publisher , Level level) {
	  super(id , name , price , publisher);
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
		return "TextBook [level=" + level + ", book = " + super.toString() + "]";
	}
}
