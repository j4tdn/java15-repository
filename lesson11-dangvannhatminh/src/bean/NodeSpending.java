package bean;

public class NodeSpending {
	private int hash;
	private String keyInfoSpending;
	private double valueMoney;
	public int getHash() {
		return hash;
	}
	public String getKeyInfoSpending() {
		return keyInfoSpending;
	}
	public void setKeyInfoSpending(String keyInfoSpending) {
		this.keyInfoSpending = keyInfoSpending;
	}
	public double getValueMoney() {
		return valueMoney;
	}
	public void setValueMoney(double valueMoney) {
		this.valueMoney = valueMoney;
	}
	public NodeSpending(String keyInfoSpending, double valueMoney) {
		this.hash = keyInfoSpending.hashCode();
		this.keyInfoSpending = keyInfoSpending;
		this.valueMoney = valueMoney;
	}
	@Override
	public String toString() {
		return "\nNodeSpending [keyInfoSpending=" + keyInfoSpending + ", valueMoney=" + valueMoney + "]";
	}
	
	
}
