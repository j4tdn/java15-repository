package ex01;

public class Contestant {
	private int id;
	private int firstPlaceCounter;
	private int secondPlaceCounter;
	private int thirdPlaceCounter;
	
	public Contestant() {
	}

	public Contestant(int id, int firstPlaceCounter, int secondPlaceCounter, int thirdPlaceCounter) {
		this.id = id;
		this.firstPlaceCounter = firstPlaceCounter;
		this.secondPlaceCounter = secondPlaceCounter;
		this.thirdPlaceCounter = thirdPlaceCounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFirstPlaceCounter() {
		return firstPlaceCounter;
	}

	public void setFirstPlaceCounter(int firstPlaceCounter) {
		this.firstPlaceCounter = firstPlaceCounter;
	}

	public int getSecondPlaceCounter() {
		return secondPlaceCounter;
	}

	public void setSecondPlaceCounter(int secondPlaceCounter) {
		this.secondPlaceCounter = secondPlaceCounter;
	}

	public int getThirdPlaceCounter() {
		return thirdPlaceCounter;
	}

	public void setThirdPlaceCounter(int thirdPlaceCounter) {
		this.thirdPlaceCounter = thirdPlaceCounter;
	}

	@Override
	public String toString() {
		return "Contestant [id=" + id + ", firstPlaceCounter=" + firstPlaceCounter + ", secondPlaceCounter="
				+ secondPlaceCounter + ", thirdPlaceCounter=" + thirdPlaceCounter + "]";
	}
}
