package bean;

public class MinMaxType {
	public int min;
	public int max;
	
	public MinMaxType(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	@Override
	public String toString() { 
		return "min = "+ min +"    "+ "max = " + max;
	}
}
