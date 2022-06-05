package Bai4;

public class customer {
	private int idCustomer;
	private String hoTen;
	private String phoneNumber;
	private String address;
	
	public customer() {
		
	}
	public customer(int idCustomer, String hoTen, String phoneNumber,String address) {
		this.idCustomer=idCustomer;
		this.hoTen=hoTen;
		this.phoneNumber=phoneNumber;
		this.address=address;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "customer [idCustomer=" + idCustomer + ", hoTen=" + hoTen + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
	
	
	
	
}
