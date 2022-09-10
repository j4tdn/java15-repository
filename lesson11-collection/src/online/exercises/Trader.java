package online.exercises;

public class Trader {
	private String Name;
	private String City;
	public Trader(String name, String city) {
		
		Name = name;
		City = city;
	}
	public Trader() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Trader [Name=" + Name + ", City=" + City + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	
}
