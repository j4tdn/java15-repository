package library;

public class TextBook extends Book {
	private Condition condition;

	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, Double price, String publisher, Condition condition) {
		super(id, price, publisher);
		this.condition = condition;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	@Override
	public String toString() {
		return "TextBook [condition=" + condition  + super.toString() + "]";
	}
	
	
}
