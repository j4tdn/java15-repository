package Ex03;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<Card> deck = CardUtils.getDeckAndShuffle();
		
		List<Card> player_1 = new ArrayList<>();
		List<Card> player_2 = new ArrayList<>();
		List<Card> player_3 = new ArrayList<>();
		List<Card> player_4 = new ArrayList<>();
		
		CardUtils.dealCard(player_1, player_2, player_3, player_4, deck);
		
		System.out.print("Player 1: ");
		CardUtils.print(player_1);
		System.out.print("Player 2: ");
		CardUtils.print(player_2);
		System.out.print("Player 3: ");
		CardUtils.print(player_3);
		System.out.print("Player 4: ");
		CardUtils.print(player_4);
	}
}
