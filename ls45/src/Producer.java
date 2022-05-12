
public class Producer {
	private String producerName, countryName;
	public Producer (String producerName, String countryName) {
		this.producerName=producerName;
		this.countryName=countryName;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
