package view;

import java.util.ArrayList;
import java.util.List;
import bean.Vocabulary;

public class Ex04Dictonary {
	public static void main(String[] args) {
		List<Vocabulary> dictionary = getDictionary();
		System.out.println(dictionary);
		Vocabulary vX = new Vocabulary("see", "nhin", "dong tu", "see ~ eyesight");
		System.out.println();

		addVocab(dictionary, vX);

		search(dictionary, "see");
	}

	private static List<Vocabulary> getDictionary() {
		Vocabulary vocab1 = new Vocabulary("see", "nhin", "dong tu", "see ~ eyesight");
		Vocabulary vocab2 = new Vocabulary("table", "cai ban", "danh tu", "co nghia phu la ban muc luc");
		Vocabulary vocab3 = new Vocabulary("beautiful", "xinh dep", "tinh tu", "beautiful ~ pretty");

		List<Vocabulary> dictionary = new ArrayList<>();
		dictionary.add(vocab1);
		dictionary.add(vocab2);
		dictionary.add(vocab3);

		return dictionary;
	}

	private static List<Vocabulary> addVocab(List<Vocabulary> dictionary, Vocabulary vocabX) {
		if (!dictionary.contains(vocabX)) {
			dictionary.add(vocabX);
		} else {
			System.out.println("vocabulary is exists");
		}
		return dictionary;
	}

	private static void search(List<Vocabulary> dictionary, String word) {
		for (Vocabulary vocab : dictionary) {
			if (vocab.getWord() == word) {
				System.out.println(vocab);
			}
		}
	}
}
