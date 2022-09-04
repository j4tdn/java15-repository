package ex03.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ex03.bean.*;
import ex03.utils.CardUtils;

public class CardGame {
	public static void main(String[] args) {		
		List<Card> deckOfCards = CardUtils.creatDeckOfCards();
		CardUtils.printCard(deckOfCards);
		System.out.println("======Shuffle Deck=========");
		CardUtils.printCard(CardUtils.shuffleDeck(deckOfCards));
		List<List<Card>> deckOfPlayers = CardUtils.distributeCard(deckOfCards, 3);
		for(List<Card> playerCard : deckOfPlayers) {
			System.out.println("Card player: ");
			CardUtils.printCard(playerCard);
			System.out.println();
		}
	}
	
}
