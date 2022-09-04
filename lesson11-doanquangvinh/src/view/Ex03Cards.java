package view;

import java.util.ArrayList;
import java.util.Random;

import bean.Cards;
import bean.Player;
import pattern.CardsManager;

public class Ex03Cards {
	public static void main(String[] args) {
        CardsManager Card = CardsManager.getInstance();
        Player P1 = new Player("P1");
        Player P2 = new Player("P2");
        Player P3 = new Player("P3");
        Player P4 = new Player("P4");


        Random rd1  = new Random();
        for (int i = 0; i < 10000; i++) {
            int a = rd1.nextInt(0,52);
            int b = rd1.nextInt(0,52);
            if(a!=b){
                Card.swap(a,b);
            }
        }

        ArrayList<Player> listPlayers = new ArrayList<>();
        listPlayers.add(P1);
        listPlayers.add(P2);
        listPlayers.add(P3);
        listPlayers.add(P4);
        //Chia bai
        int count = 0;
        for (Player p : listPlayers) {
            ArrayList<Cards> playerCards = new ArrayList<>();
            for (int i = count; i < count + 13; i++) {
                playerCards.add(Card.listCards.get(i));
            }
            count += 13;
            p.setCards(playerCards);
        }
        for (Player p : listPlayers) {
            System.out.println(p.getName());
            for (Cards c:p.getCards()) {
                System.out.println(c);
            }
            System.out.println();
        }
    }
}


