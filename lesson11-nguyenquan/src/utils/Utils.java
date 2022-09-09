package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.AmountOfMoney;
import bean.Card;
import bean.English;
import bean.Oder;
import bean.Properties;
import bean.SpendingInformation;
import bean.TypeOfVoCabulary;
import bean.Vietnamese;

public class Utils {
	private Utils() {

	}

	public static List<Card> takeCards() {
		List<Properties> properties = new ArrayList<>();
		List<Oder> oders = new ArrayList<>();
		List<Card> cardrs = new ArrayList<>();
		int countPro = 0;
		int countOd = 0;
		for (Properties propertie : Properties.values()) {
			properties.add(propertie);

		}
		for (Oder oder : Oder.values()) {
			oders.add(oder);
		}

		for (int i = 0; i < 52; i++) {
			cardrs.add(new Card(properties.get(countPro), oders.get(countOd)));
			countOd++;

			if (countOd == 13) {
				countOd = 0;
				countPro++;
			}

		}
		return cardrs;

	}

	public static Map<English, Vietnamese> getVocabulary() {
		Map<English, Vietnamese> vocabularys = new HashMap<>();
		vocabularys.put(new English("hello"), new Vietnamese("xin chào", TypeOfVoCabulary.noun, "danh từ cảm thán"));
		vocabularys.put(new English("warehouse"), new Vietnamese("nhà kho", TypeOfVoCabulary.noun, " kho chứa hàng"));
		vocabularys.put(new English("beautiful"),
				new Vietnamese("xinh đẹp", TypeOfVoCabulary.adjective, "tính từ cảm thán"));
		return vocabularys;
	}
	public static Map<SpendingInformation, AmountOfMoney> getInformation(){
		Map<SpendingInformation, AmountOfMoney> information = new HashMap<>();
		information.put(new SpendingInformation("ăn sáng"), new AmountOfMoney(15000));
		information.put(new SpendingInformation("mua áo"), new AmountOfMoney(570000));
		information.put(new SpendingInformation("ăn trưa"), new AmountOfMoney(30000));
		information.put(new SpendingInformation("mua bàn"), new AmountOfMoney(600000));
		information.put(new SpendingInformation("ăn tối"), new AmountOfMoney(550000));
		 
		
		return information;
		
	}
	

}
