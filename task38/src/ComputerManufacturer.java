
public class ComputerManufacturer {
	private String computerName;
	private Manufacturer manufacturer;
	private Date manufactererDate;
	private double price;
	private double waranty;

	public ComputerManufacturer(String computerName, Manufacturer manufacturer, Date manufactererDate, double price, double waranty) {

		this.manufacturer = manufacturer;
		this.manufactererDate = manufactererDate;
		this.price = price;
		this.waranty = waranty;
		this.computerName = computerName;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getManufactererDate() {
		return manufactererDate;
	}

	public void setManufactererDate(Date manufactererDate) {
		this.manufactererDate = manufactererDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWaranty() {
		return waranty;
	}

	public void setWaranty(double waranty) {
		this.waranty = waranty;
	}

	public String getComputerName() {
		return computerName;
	}

	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public boolean comparePrice(ComputerManufacturer otherComputerManufacturer) {
		return this.price>otherComputerManufacturer.price;
	}
	public String takeCountryName() {
		return this.manufacturer.getManufacturerName();
	}
	

}
