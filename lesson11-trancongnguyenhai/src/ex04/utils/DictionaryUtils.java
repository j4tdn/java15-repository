package ex04.utils;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import ex04.bean.Word;

public class DictionaryUtils {
	public DictionaryUtils() {

	}

	public static List<Word> addWord(List<Word> words, Word newWord) {
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).getWord() == newWord.getWord()) {
				return words;
			} else {
				if (i < words.size()) {
					continue;
				} else {
					words.add(newWord);
				}
			}
		}
		return words;
	}
	
	public static Word searchWord(List<Word> words, String wordSearch) {
		for(Word word : words) {
			if(word.getWord().equals(wordSearch)){
				return word;
			}
		}
		return null;
	}
}
