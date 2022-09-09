package bean;

public class Vietnamese {

	private String means;
	private TypeOfVoCabulary type;
	private String note;

	public Vietnamese() {

	}

	public Vietnamese(String means, TypeOfVoCabulary type, String note) {

		this.means = means;
		this.type = type;
		this.note = note;
	}

	public String getMeans() {
		return means;
	}

	public void setMeans(String means) {
		this.means = means;
	}

	public TypeOfVoCabulary getType() {
		return type;
	}

	public void setType(TypeOfVoCabulary type) {
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
		return "Vocabulary [ means=" + means + ", type=" + type + ", note=" + note + "]";
	}

}
