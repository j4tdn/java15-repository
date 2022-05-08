package bean;

public class MinMaxType {
	public int max;
	public int min;
	
	public MinMaxType(int min, int max) {
		this.min = min;
		this.max = max;
	}
	@Override
	public String toString() {
		return "min = " + min + "," + "max = " + max;
	}
}
