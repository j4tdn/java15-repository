package inheritance;

public class Textbook {
  private Level level;
  
  public Textbook(String id , String name , double price , String publisher , Level level) {
	  super(id , name , price , publisher);
	  this.level = level;
  }
}
