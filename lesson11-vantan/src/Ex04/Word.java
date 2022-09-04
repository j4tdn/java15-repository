package Ex04;

import java.util.Objects;

public class Word {
	private String word;
	
	public Word() {
	}

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Word)) {
			return false;
		}
		Word that = (Word)obj;
		return this.getWord().equals(that.getWord());
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(word);
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	
	
}
