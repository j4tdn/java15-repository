package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



import bean.Card;

import static utils.Utils.*;

public class Ex03AppCard {
	public static void main(String[] args) {
		List<Card> cards = takeCards();
		List<Card> player1 = new ArrayList<>();
		List<Card> player2 = new ArrayList<>();
		List<Card> player3 = new ArrayList<>();
		List<Card> player4 = new ArrayList<>();
		Random random = new Random();
		int value = 0;
		int count = 52;
		for (int i = 0; i < 13; i++) {
			value = random.nextInt(0, count);
			player1.add(cards.get(value));
			cards.remove(value);
			count--;

			value = random.nextInt(0, count);
			player2.add(cards.get(value));
			cards.remove(value);
			count--;

			value = random.nextInt(0, count);
			player3.add(cards.get(value));
			cards.remove(value);
			count--;

			value = random.nextInt(0, count);
			player4.add(cards.get(value));
			cards.remove(value);
			count--;

		}
		System.out.println("player1:");
		for (int i = 0; i < player1.size(); i++) {
			System.out.print(player1.get(i));

		}
		System.out.println();
		
		
		System.out.println("player2:");
		for (int i = 0; i < player2.size(); i++) {
			System.out.print(player2.get(i));

		}
		System.out.println();
		
		
		System.out.println("player3:");
		for (int i = 0; i < player3.size(); i++) {
			System.out.print(player3.get(i));

		}
		System.out.println();
		
		System.out.println("player4:");
		for (int i = 0; i < player4.size(); i++) {
			System.out.print(player4.get(i));

		}

	}

}
