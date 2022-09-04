package ex04.model;

import java.util.ArrayList;
import java.util.List;

import ex04.bean.Word;

public class DictionaryModel {
	public DictionaryModel() {
		
	}
	
	public static List<Word> getDictionary(){
		List<Word> result = new ArrayList<>();
		result.add(new Word("fish", "cá", "noun", "xxxxxx"));
		result.add(new Word("whale", "cá voi", "noun", "xxxxxx"));
		result.add(new Word("shark", "cá mập", "noun", "xxxxxx"));
		result.add(new Word("sweet", "ngọt", "adj", "xxxxxx"));
		result.add(new Word("taste", "ngon", "adj", "xxxxxx"));
		result.add(new Word("tall", "cao", "adj", "xxxxxx"));
		result.add(new Word("swim", "bơi", "verd", "xxxxxx"));
		result.add(new Word("walk", "đi bộ", "verd", "xxxxxx"));
		result.add(new Word("climb", "trèo", "verd", "xxxxxx"));
		return result;
	}
}
