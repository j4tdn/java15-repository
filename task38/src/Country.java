
public class Country {
	private int countryCode;
	private String countryName;
	public Country(int countryCode, String countryName) {
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName=countryName;
	}
	

}
