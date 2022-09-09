package bean;

public class Card {
	private Properties properties;
	private Oder oder;

	public Card() {

	}

	public Card(Properties properties, Oder oder) {
		super();
		this.properties = properties;
		this.oder = oder;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Oder getOder() {
		return oder;
	}

	public void setOder(Oder oder) {
		this.oder = oder;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Card)) {
			return false;
		}
		Card that = (Card) obj;
		return getProperties().equals(that.getProperties()) && getOder().equals(that.getOder());
	}

	@Override
	public String toString() {
		return "Card [properties=" + properties + ", oder=" + oder + "]";
	}

}
