package bean;

import java.util.ArrayList;

public class Player {
	String name;
	ArrayList<Cards> cards;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Cards> getCards() {
		if (cards == null)
			cards = new ArrayList<>();
		return cards;
	}

	public void setCards(ArrayList<Cards> cards) {
		this.cards = cards;
	}
}
