package Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlayingCard {
	public static void main(String[] args) {
		List<Card> cards = new ArrayList<Card>(52);
		Suit[] suits = Suit.values();
		Rank[] ranks = Rank.values();

		for (int j = 0; j < suits.length; j++) {
			for (int k = 0; k < ranks.length; k++) {
				Card card = new Card(suits[j], ranks[k]);
				if (!compareCard(cards, card)) {
					cards.add(card);
				}

			}
		}
		List<Card> p1 = new ArrayList<>();
		List<Card> p2 = new ArrayList<>();
		List<Card> p3 = new ArrayList<>();
		List<Card> p4 = new ArrayList<>();
		
		for (int i = 0; i < cards.size(); i += 4) {
			p1.add(cards.get(i));
			p2.add(cards.get(i+1));
			p3.add(cards.get(i+2));
			p4.add(cards.get(i+3));			
		}

		System.out.println("p1 " +p1);
		System.out.println("p2 " + p2);
		System.out.println("p3 " +p3);
		System.out.println("p4 " +p4);
	}

	private static boolean compareCard(List<Card> cards, Card card) {
		for (Card c : cards) {
			if (card.equals(c)) {
				return true;
			}
		}
		return false;
	}

}
