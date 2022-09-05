package ex04;

public class Distionary {
	private String vocabulary;
	private String mean;
	private String type;
	private String note;
	
	public Distionary() {
		// TODO Auto-generated constructor stub
	}
	
	public Distionary(String vocabulary, String mean, String type, String note) {
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
		return "\nDistionary [vocabulary=" + vocabulary + ", mean=" + mean + ", type=" + type + ", note=" + note + "]";
	}
	
	
	
}