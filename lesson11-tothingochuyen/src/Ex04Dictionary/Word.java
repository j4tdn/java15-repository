package Ex04Dictionary;

public class Word {
	private String word;
	private String meaning;
	private String type;
	private String note;
	
	public Word() {
		
	}

	public Word(String word, String meaning, String type, String note) {
		this.word = word;
		this.meaning = meaning;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}
}
