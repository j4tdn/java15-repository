package bean;

import java.util.Objects;

public class English {
	private String Word;
	public English() {
		
	}
	public English(String word) {
		
		Word = word;
	}
	public String getWord() {
		return Word;
	}
	public void setWord(String word) {
		Word = word;
	}
	@Override
	public String toString() {
		return "English [Word=" + Word + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof English)) {
			return false;
		}
		English that = (English)obj;
		return getWord().equals(that.getWord());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getWord());

	}

}
