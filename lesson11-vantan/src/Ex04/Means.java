package Ex04;

public class Means {
	private String meaning;
	private String type;
	private String note;
	
	 public Means() {
	}

	public Means(String meaning, String type, String note) {
		this.meaning = meaning;
		this.type = type;
		this.note = note;
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
		return "Means [meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}

	
	 
	 
}
