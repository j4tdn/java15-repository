package bean;

public class Vocabulary {
	private String word;
	private String mean;
	private String type;
	private String note;
	
	public Vocabulary() {
	}

	public Vocabulary(String word, String mean, String type, String note) {
		super();
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
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
		return "\nVocabulary [word=" + word + ", mean=" + mean + ", type=" + type + ", note=" + note + "]";
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Vocabulary)) {
			return false;
		}
		
		Vocabulary that = (Vocabulary) o;
		return getWord() == that.getWord();
	}
}
