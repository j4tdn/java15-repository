package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		List<Card> card = new ArrayList<>();
		card = getListCard();
		//System.out.println(card);
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		List<Card> player3 = new ArrayList<>();
		List<Card> player4 = new ArrayList<>();
		int r = 0;
		Random rand = new Random();
		while (!card.isEmpty()) {
				r = rand.nextInt(card.size());
				player1.add(card.get(r));
				card.remove(r);
				r = rand.nextInt(card.size());
				player2.add(card.get(r));
				card.remove(r);
				r = rand.nextInt(card.size());
				player3.add(card.get(r));
				card.remove(r);
				r = rand.nextInt(card.size());
				player4.add(card.get(r));
				card.remove(r);
			
		}
		System.out.println("player1: " + player1);
		System.out.println("player2: " + player2);
		System.out.println("player3: " + player3);
		System.out.println("player4: " + player4);

	}

	private static List<Card> getListCard() {
		List<Card> card = new ArrayList<>();

		Rank[] ranks = Rank.values();
		Type[] types = Type.values();

		for (Rank rank : ranks) {
			for (Type type : types) {
				card.add(new Card(rank, type));
			}
		}
		return card;
	}
}
