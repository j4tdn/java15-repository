package ex04.bean;

public class Word {
	private String word;
	private String transWord;
	private String typeWord;
	private String note;
	
	public Word() {

	}

	public Word(String word, String transWord, String typeWord, String note) {
		this.word = word;
		this.transWord = transWord;
		this.typeWord = typeWord;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getTransWord() {
		return transWord;
	}

	public void setTransWord(String transWord) {
		this.transWord = transWord;
	}

	public String getTypeWord() {
		return typeWord;
	}

	public void setTypeWord(String typeWord) {
		this.typeWord = typeWord;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", transWord=" + transWord + ", typeWord=" + typeWord + ", note=" + note + "]";
	}
	
	
	
}
