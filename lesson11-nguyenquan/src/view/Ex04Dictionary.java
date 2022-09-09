package view;

import java.util.Map;

import bean.English;
import bean.TypeOfVoCabulary;
import bean.Vietnamese;
import static utils.Utils.*;

public class Ex04Dictionary {
	public static void main(String[] args) {
		Map<English, Vietnamese> vocabulary = getVocabulary();

		vocabulary = add(vocabulary);
		System.out.println(vocabulary);
		search(vocabulary);
	}

	public static Map<English, Vietnamese> add(Map<English, Vietnamese> map) {
		English english = new English("warehouse");
		Vietnamese vietnamese = new Vietnamese("ngôi nhà", TypeOfVoCabulary.noun, "nơi ở");

		map.putIfAbsent(english, vietnamese);
		return map;

	}

	public static void search(Map<English, Vietnamese> map) {
		English english = new English("warehouse");
		Vietnamese vietnamese = map.get(english);
		System.out.println(english.toString() + ": " + vietnamese.toString());

	}

}
