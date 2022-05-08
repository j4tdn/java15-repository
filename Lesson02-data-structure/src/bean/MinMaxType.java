package bean;

public class MinMaxType {
public int min;
private int max;
public MinMaxType(int min, int max) {
	this.max= max;
	this.min= min;
}
@Override
public String toString() {
	return min +" min" +","+ max + "max";
}
}


	


