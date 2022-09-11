package online.exercises;

public class Trader {
	private String name;
	private String country;
	public Trader() {
		
	}
	public Trader(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "\n Trader [name=" + name + ", country=" + country + "]";
	}
	
	
	
	
}
