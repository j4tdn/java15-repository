package persistence;

import java.time.LocalDateTime;

public class Order {
    private Integer orderId;
    private String address;
    private String phoneNumber;
    private LocalDateTime deliveryDate;
    private Double deliveryFee;
    private Double totalFee;
    private Integer staffId;
    private Integer customerId;
    private Integer contactId;
    private String note;
    
    public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, String address, String phoneNumber, LocalDateTime deliveryDate, Double deliveryFee,
			Double totalFee, Integer staffId, Integer customerId, Integer contactId, String note) {
		super();
		this.orderId = orderId;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.deliveryDate = deliveryDate;
		this.deliveryFee = deliveryFee;
		this.totalFee = totalFee;
		this.staffId = staffId;
		this.customerId = customerId;
		this.contactId = contactId;
		this.note = note;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDateTime deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Double getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(Double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", address=" + address + ", phoneNumber=" + phoneNumber + ", deliveryDate="
				+ deliveryDate + ", deliveryFee=" + deliveryFee + ", totalFee=" + totalFee + ", staffId=" + staffId
				+ ", customerId=" + customerId + ", contactId=" + contactId + ", note=" + note + "]";
	}
    
}
