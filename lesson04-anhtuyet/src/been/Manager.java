package been;

public class Manager extends People {
private int numofemp;

public Manager() {
}

public Manager(String name, String date, float cosalary, int numofemp) {
	super(name, date, cosalary);
	this.numofemp = numofemp;
}

public int getNumpositon() {
	return numofemp;
}

public void setNumpositon(int numofemp) {
	this.numofemp = numofemp;
}

@Override
public String toString() {
	return super.toString() + "numofemp=" + numofemp;
}
public float payRoll() {
	return this.getCosalary() * 2200000;
}
}
