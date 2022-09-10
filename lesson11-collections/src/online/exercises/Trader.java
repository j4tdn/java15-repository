package online.exercises;

import java.util.Objects;

import bean.Warehouse;

public class Trader {
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nTrader [name=" + name + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj )
		{
			return true;
		}
		if(!(obj instanceof Warehouse))
		{
			return false;
		}
		Trader that = (Trader)obj;
		return getName().equals(that.getName()) && getCity().equals(that.getCity());
	}
	
}
