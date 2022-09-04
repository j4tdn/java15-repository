package pattern;

import bean.Cards;

import java.util.ArrayList;
import java.util.Collections;

public class CardsManager {
	private static CardsManager instance = null;

	public ArrayList<Cards> listCards;

	private CardsManager() {
		listCards = new ArrayList<>();
	}

	public static CardsManager getInstance() {
		if (instance == null) {
			instance = new CardsManager();
			String[] types = { "cơ", "rô", "chuồn", "bích" };
			String[] nums = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
			for (String s : types) {
				for (String n : nums) {
					instance.listCards.add(new Cards(s, n));
				}
			}
		}
		return instance;
	}

	public void swap(int a, int b) {
		Collections.swap(this.listCards, a, b);
	}

	public ArrayList<Cards> getListCards() {
		return listCards;
	}
}
