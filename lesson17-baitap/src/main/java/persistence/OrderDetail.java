package persistence;

public class OrderDetail {
	private int orderDetailId;
	private int sellNumber;
	
	public OrderDetail() {
	}

	public OrderDetail(int orderDetailId, int sellNumber) {
		super();
		this.orderDetailId = orderDetailId;
		this.sellNumber = sellNumber;
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getSellNumber() {
		return sellNumber;
	}

	public void setSellNumber(int sellNumber) {
		this.sellNumber = sellNumber;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetailId=" + orderDetailId + ", sellNumber=" + sellNumber + "]";
	}
	
	
}
