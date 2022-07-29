package common;

public enum Rank {
	F("F"),
	D("D"),
	C("C"),
	B("B"),
	A("A");
	
	private String rankAsString;

	private Rank(String rankAsString) {
		this.rankAsString = rankAsString;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rankAsString;
	}
	
	
	
}
