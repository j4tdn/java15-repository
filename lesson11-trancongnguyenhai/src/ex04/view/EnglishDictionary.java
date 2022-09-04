package ex04.view;

import java.util.ArrayList;
import java.util.List;

import ex04.bean.Word;
import ex04.model.DictionaryModel;
import ex04.utils.DictionaryUtils;

public class EnglishDictionary {
	public static void main(String[] args) {
		List<Word> words = new ArrayList<>();
		words = DictionaryModel.getDictionary();
		DictionaryUtils.addWord(words, new Word("horse", "cá voi", "noun", "xxxxxx"));
		for(Word word : words) {
			System.out.println(word);
		}
		String wordSearch = "fish";
		System.out.println("Search...........");
		System.out.println("Word result: " + DictionaryUtils.searchWord(words, wordSearch));
	}
}
