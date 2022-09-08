package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardUtils {
	
	private CardUtils() {}
	
	public static List<Card> getDeckAndShuffle() {
		List<Card> deck = new ArrayList<>();
		String[] name = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suit = {"♥", "♦", "♣", "♠"};
		
		for(int i = 0; i < suit.length; i++) {
			for(int j = 0; j < name.length; j++) {
				deck.add(new Card(name[j], suit[i]));
			}
		}
		
		Collections.shuffle(deck);
		
		return deck;
	}
	
	public static void dealCard(List<Card> player_1, List<Card> player_2, List<Card> player_3, List<Card> player_4, List<Card> deck) {
		for(int i = 0; i < deck.size(); i++) {
			if(i % 4 == 0) {
				player_1.add(deck.get(i));
			} else if(i % 4 == 1) {
				player_2.add(deck.get(i));
			} else if(i % 4 == 2) {
				player_3.add(deck.get(i));
			} else {
				player_4.add(deck.get(i));
			}
		}
	}
	
	public static void print(List<Card> list) {
		for(Card card : list) {
			System.out.print("[" + card.getName() + card.getSuit() + "]");
		}
		System.out.println();
	}
}
