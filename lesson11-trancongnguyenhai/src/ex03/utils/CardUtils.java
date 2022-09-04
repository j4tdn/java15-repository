package ex03.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import ex03.bean.Card;
import ex03.bean.Suit;

public class CardUtils {
	public static List<Card> creatDeckOfCards() {
		List<Card> deck = new ArrayList<>();
		String[] wildCard = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		Suit[] suitCard = { Suit.Heart, Suit.Diamond, Suit.Club, Suit.Spade };
		for (int i = 0; i < wildCard.length; i++) {
			for (int j = 0; j < suitCard.length; j++) {
				deck.add(new Card(wildCard[i], suitCard[j]));
			}
		}
		return deck;
	}

	public static void printCard(List<Card> deckOfCards) {
		for (int i = 0; i < deckOfCards.size(); i++) {
			if (i % 4 != 3) {
				System.out.print(deckOfCards.get(i).toString() + " ");
			} else {
				System.out.println(deckOfCards.get(i).toString());
			}
		}
	}

	public static List<Card> shuffleDeck(List<Card> deck) {
		List<Card> afterShuffleDeck = deck;
		Collections.shuffle(afterShuffleDeck);
		return afterShuffleDeck;
	}

	public static List<List<Card>> distributeCard(List<Card> deck, int numPlayer) {
		List<List<Card>> result = new ArrayList<>();
		for(int i = 0; i < numPlayer; i++) {
			result.add(new ArrayList<>());
		}
		while(deck.iterator().hasNext() && deck.size() > 52 - 13 * numPlayer) {
			for(int i = 0; i < numPlayer; i++) {
				if(!deck.iterator().hasNext()) {
					break;
				} else {
					result.get(i).add(deck.get(0));
					deck.remove(0);
				}
			}
		}
		return result;
	}
}
