package bean;

public class Number {
	 static int numberofUp;
	 static int numberofLow;
	 static int numberofnumber;
	public Number() {
		// TODO Auto-generated constructor stub
	}
	public static int getNumberofUp() {
		return numberofUp;
	}
	public static void setNumberofUp(int numberofUp) {
		Number.numberofUp = numberofUp;
	}
	public static int getNumberofLow() {
		return numberofLow;
	}
	public static void setNumberofLow(int numberofLow) {
		Number.numberofLow = numberofLow;
	}
	public static int getNumberofnumber() {
		return numberofnumber;
	}
	public static void setNumberofnumber(int numberofnumber) {
		Number.numberofnumber = numberofnumber;
	}
	@Override
	public String toString() {
		return this.numberofUp +", "+ this.numberofLow +", " + this.numberofnumber;
	}
	
	
}
