package ex02;

import java.util.List;

public class Cd {
	public Cd() {
	}
	private int Id;
	private String TypeCd;
	private String Singer;
	private int Amount;
	private float Price;
	public Cd(int id, String typeCd, String singer, int amount, float price) {
		
		Id = id;
		TypeCd = typeCd;
		Singer = singer;
		Amount = amount;
		Price = price;
	}
	@Override
	public String toString() {
		return "Cd [Id=" + Id + ", TypeCd=" + TypeCd + ", Singer=" + Singer + ", Amount=" + Amount + ", Price=" + Price
				+ "]\n";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTypeCd() {
		return TypeCd;
	}
	public void setTypeCd(String typeCd) {
		TypeCd = typeCd;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Cd)) return false;
		Cd that = (Cd)o;
		return getId() == that.getId();
	}
	
	
	
	
}
