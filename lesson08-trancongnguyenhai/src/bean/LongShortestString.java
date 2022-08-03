package bean;

public class LongShortestString {
	private int longOfLongestString;
	private String detailOfLongestString;
	private int indexOfLongestString;
	private int longOfShortestString;
	private String detailOfShortestString;
	private int indexOfShortestString;

	public LongShortestString() {

	}

	public LongShortestString(int longOfLongestString, String detailOfLongestString, int indexOfLongestString,
			int longOfShortestString, String detailOfShortestString, int indexOfShortestString) {
		super();
		this.longOfLongestString = longOfLongestString;
		this.detailOfLongestString = detailOfLongestString;
		this.indexOfLongestString = indexOfLongestString;
		this.longOfShortestString = longOfShortestString;
		this.detailOfShortestString = detailOfShortestString;
		this.indexOfShortestString = indexOfShortestString;
	}

	public int getLongOfLongestString() {
		return longOfLongestString;
	}

	public void setLongOfLongestString(int longOfLongestString) {
		this.longOfLongestString = longOfLongestString;
	}

	public String getDetailOfLongestString() {
		return detailOfLongestString;
	}

	public void setDetailOfLongestString(String detailOfLongestString) {
		this.detailOfLongestString = detailOfLongestString;
	}

	public int getIndexOfLongestString() {
		return indexOfLongestString;
	}

	public void setIndexOfLongestString(int indexOfLongestString) {
		this.indexOfLongestString = indexOfLongestString;
	}

	public int getLongOfShortestString() {
		return longOfShortestString;
	}

	public void setLongOfShortestString(int longOfShortestString) {
		this.longOfShortestString = longOfShortestString;
	}

	public String getDetailOfShortestString() {
		return detailOfShortestString;
	}

	public void setDetailOfShortestString(String detailOfShortestString) {
		this.detailOfShortestString = detailOfShortestString;
	}

	public int getIndexOfShortestString() {
		return indexOfShortestString;
	}

	public void setIndexOfShortestString(int indexOfShortestString) {
		this.indexOfShortestString = indexOfShortestString;
	}

	@Override
	public String toString() {
		return "LongestString: " + longOfLongestString + " " + detailOfLongestString + " " + "[" + indexOfLongestString
				+ "]" + "\n" + "ShortestString: " + longOfShortestString + " " + detailOfShortestString + " " + "["
				+ indexOfShortestString + "]";
	}

}