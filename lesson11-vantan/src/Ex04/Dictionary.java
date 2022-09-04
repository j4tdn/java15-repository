package Ex04;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	private Map<Word, Means> dictionary = new HashMap<>();
		
	public Dictionary() {
	}

	public Dictionary(Map<Word, Means> dictionary) {
		this.dictionary = dictionary;
	}
	public void addWord(Word word, Means means) {
		this.dictionary.put(word, means);
	}
	
	public Means loopUp(Word word){
		return this.dictionary.get(word);
	}
}
