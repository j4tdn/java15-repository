package lesson03baitap;

public class InputTransport {
private String owner;
private String type;
private String CC;
private double cost;
public InputTransport() {
	
}
public InputTransport(String owner, String type, String cC, double cost) {
	super();
	this.owner = owner;
	this.type = type;
	this.CC = cC;
	this.cost = cost;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCC() {
	return CC;
}
public void setCC(String cC) {
	this.CC = cC;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "InputTransport [owner=" + owner + ", type=" + type + ", CC=" + CC + ", cost=" + cost + "]";
}

}
