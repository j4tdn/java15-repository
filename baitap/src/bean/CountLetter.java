package bean;

public class CountLetter {
	private int wowel;
	private int consonal;
	
	public CountLetter() {
	}

	public CountLetter(int wowel, int consonal) {
		this.wowel = wowel;
		this.consonal = consonal;
	}

	public int getWowel() {
		return wowel;
	}

	public void setWowel(int wowel) {
		this.wowel = wowel;
	}

	public int getConsonal() {
		return consonal;
	}

	public void setConsonal(int consonal) {
		this.consonal = consonal;
	}

	@Override
	public String toString() {
		return "CountLetter [wowel=" + wowel + ", consonal=" + consonal + "]";
	}
	
	
}
