package ex03;

public class Card {
	private Rank rank;
	private Type type;
	
	public Card(Rank rank, Type type) {
		this.rank = rank;
		this.type = type;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return rank +" "+ type;
	}

	
	
	
}
