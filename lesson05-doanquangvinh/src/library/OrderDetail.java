package library;

public class OrderDetail {
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}

	private Customer customer;
	private ReferenceBook rb;
	private TextBook tb;
	public OrderDetail(Customer customer, ReferenceBook rb, TextBook tb) {
		super();
		this.customer = customer;
		this.rb = rb;
		this.tb = tb;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ReferenceBook getRb() {
		return rb;
	}
	public void setRb(ReferenceBook rb) {
		this.rb = rb;
	}
	public TextBook getTb() {
		return tb;
	}
	public void setTb(TextBook tb) {
		this.tb = tb;
	}
	@Override
	public String toString() {
		return "OrderDetail: \n customer=" + customer + "\n rb=" + rb + "\n tb=" + tb + "";
	}
	
	
    
}
