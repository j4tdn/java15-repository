package Ex03;

public class Card {
	private String name;
	private String suit;
	
	public Card() {}

	public Card(String name, String suit) {
		this.name = name;
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Card [name=" + name + ", suit=" + suit + "]";
	}
	
	
}
