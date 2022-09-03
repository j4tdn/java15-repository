package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Card {
	private String typeCard;
	private String indexCard;
	public String getTypeCard() {
		return typeCard;
	}
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}
	public String getIndexCard() {
		return indexCard;
	}
	public void setIndexCard(String indexCard) {
		this.indexCard = indexCard;
	}
	public Card(String typeCard, String indexCard) {
		super();
		this.typeCard = typeCard;
		this.indexCard = indexCard;
	}
	@Override
	public String toString() {
		return "\n Card [typeCard=" + typeCard + ", indexCard=" + indexCard + "]";
	}
	public static List<Card> initialListCard()
	{
		String[] typeCards = {"Spades","Clubs","Diamonds","Hearts"};
		String[] indexCards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		List<Card> cards = new ArrayList<>();
		for(String i : typeCards) {
			
			for(String j : indexCards)
			{
				cards.add(new Card(i,j));
			}
		}
		return cards;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Card))
		{
			return false;
		}
		Card that = (Card) o;
		return typeCard == that.getTypeCard() && indexCard == that.getIndexCard();
	}
	
}
