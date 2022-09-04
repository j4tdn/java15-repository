package Ex03;

import java.util.Objects;

public class Card {
	private Suit suit;
	private Rank rank;
	
	public Card() {
	}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
			
		}
		if(!(obj instanceof Card)) {
			return false;
		}
		Card that = (Card) obj;
		return this.getSuit().equals(that.getSuit())
				&&this.getRank().equals(that.getRank());
	}
	@Override
	public int hashCode() {
		return Objects.hash(getSuit(), getRank());
	}
	@Override
	public String toString() {
		return rank + " " + suit + "]";
	}
	
	
}
