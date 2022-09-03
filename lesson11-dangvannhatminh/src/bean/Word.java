package bean;

public class Word {
	private String vocab;
	private String mean;
	private String typeWord;
	private String note;
	public String getVocab() {
		return vocab;
	}
	public void setVocab(String vocab) {
		this.vocab = vocab;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
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
		return "\nWord [vocab=" + vocab + ", mean=" + mean + ", typeWord=" + typeWord + ", note=" + note + "]";
	}
	public Word(String vocab, String mean, String typeWord, String note) {
		super();
		this.vocab = vocab;
		this.mean = mean;
		this.typeWord = typeWord;
		this.note = note;
	}
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Word))
			return false;
		Word that = (Word) o;
		return getVocab() == that.getVocab();
	}
	
}	
