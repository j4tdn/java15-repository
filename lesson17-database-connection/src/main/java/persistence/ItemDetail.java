package persistence;

public class ItemDetail {
	private Integer orderId;
	private Integer itemId;
	private String sizeId;
	private Integer quantity;

	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Integer orderId, Integer itemId, String sizeId, Integer quantity) {
		super();
		this.orderId = orderId;
		this.itemId = itemId;
		this.sizeId = sizeId;
		this.quantity = quantity;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getSizeId() {
		return sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDetail [orderId=" + orderId + ", itemId=" + itemId + ", sizeId=" + sizeId + ", quantity=" + quantity
				+ "]";
	}
	
}
