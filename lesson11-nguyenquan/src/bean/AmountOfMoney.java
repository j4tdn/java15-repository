package bean;

public class AmountOfMoney {
	private float money;
	public AmountOfMoney() {
	
	}
	public AmountOfMoney(float money) {
	
		this.money = money;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "AmountOfMoney [money=" + money + "]";
	}
	
	
	

}
