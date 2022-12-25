package persistence;

public class Item {
	private int itemId;
	private String name;
	private OrderDetail orderDetail;
	private Order order;
	
	public Item() {
	}	
	
	public Item(int itemId, String name, Order order) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.order = order;
	}
	
	

	public Item(int itemId, String name, OrderDetail orderDetail) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.orderDetail = orderDetail;
	}

	public Item(int itemId, String name, OrderDetail orderDetail, Order order) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.orderDetail = orderDetail;
		this.order = order;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", orderDetail=" + orderDetail + ", order=" + order + "]";
	}
	
}
