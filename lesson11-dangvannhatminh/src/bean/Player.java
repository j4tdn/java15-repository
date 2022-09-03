package bean;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> cards = new ArrayList<>();

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public Player()
	{
		
	}
	@Override
	public String toString() {
		return "\nPlayer [cards=" + cards + "]";
	}
	public static List<Player> initialData(int n)
	{
		List<Player> result = new ArrayList<>();
		for(int i = 0;i<n;i++)
		{
			result.add(new Player());
		}
		return result;
	}
}
