package ex04;

public class Word {
	private String vocabulary;
	private String mean;
	private String type;
	private String note;
	
	public Word() {
		// TODO Auto-generated constructor stub
	}
	
	public Word(String vocabulary, String mean, String type, String note) {
		super();
		this.vocabulary = vocabulary;
		this.mean = mean;
		this.type = type;
		this.note = note;
	}

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
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
		return "\nWord [vocabulary=" + vocabulary + ", mean=" + mean + ", type=" + type + ", note=" + note + "]";
	}
	
	
	
}
