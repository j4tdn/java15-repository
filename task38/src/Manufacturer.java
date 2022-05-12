
public class Manufacturer {
	private String manufacturerName;
	private Country country;
	
	public Manufacturer(String manufacturerName, Country country) {
		this.manufacturerName = manufacturerName;
		this.country = country;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String takeCountryName() {
		return this.country.getCountryName();
	}
	
}
