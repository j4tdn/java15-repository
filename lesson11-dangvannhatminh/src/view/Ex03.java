package view;

import java.util.List;
import java.util.Random;

import bean.Card;
import bean.Player;

public class Ex03 {
	public static void main(String[] args) {
		List<Card> cards = Card.initialListCard();
		testCards(cards);
		shuffleCards(cards);
		List<Player> players = Player.initialData(4);
		dealCards(cards, players);
		System.out.println(players);

	}

	public static boolean testCards(List<Card> source) {
		if (source.size() != 52) {
			return false;
		}
		for (int i = 0; i < source.size(); i++) {
			for (int j = 0; j < source.size(); j++) {
				if (i == j)
					continue;
				if (source.get(i).equals(source.get(j))) {
					return false;
				}
			}
		}
		return true;
	}

	public static void shuffleCards(List<Card> source) {
		source.sort((o1, o2) -> (new Random()).nextInt(2) - 1);
	}

	public static void dealCards(List<Card> cards, List<Player> players) {
		int count = 0;
		for (int i = 0; i < cards.size(); i++) {
			players.get(count++)
					.getCards()
					.add(cards.get(i));
			if(count == 4) count = 0;
		}
	}

}
