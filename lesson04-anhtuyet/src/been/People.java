package been;

public class People {
	private String name;
	private String date;
	private float cosalary;
	
public People() {
	// TODO Auto-generated constructor stub
}

public People(String name, String date, float cosalary) {
	super();
	this.name = name;
	this.date = date;
	this.cosalary = cosalary;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public float getCosalary() {
	return cosalary;
}

public void setCosalary(float cosalary) {
	this.cosalary = cosalary;
}

@Override
public String toString() {
	return "People [name=" + name + ", date=" + date + ", cosalary=" + cosalary + "]";
}
public float payRoll() {
	return 0;
}
}
