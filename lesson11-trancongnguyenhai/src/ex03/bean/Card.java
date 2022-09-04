package ex03.bean;

public class Card {
	private String wildCard;
	private Suit suitCard;

	public Card() {

	}

	public Card(String wildCard, Suit suitCard) {
		this.wildCard = wildCard;
		this.suitCard = suitCard;
	}

	public String getWildCard() {
		return wildCard;
	}

	public void setWildCard(String wildCard) {
		this.wildCard = wildCard;
	}

	public Suit getSuitCard() {
		return suitCard;
	}

	public void setSuitCard(Suit suitCard) {
		this.suitCard = suitCard;
	}

	@Override
	public String toString() {
		return "" + "(" + wildCard + "," + suitCard + ")";
	}

}
