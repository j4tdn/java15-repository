package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietMatHang")
public class ItemDetail {
	
	@EmbeddedId
	private Id id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH" , referencedColumnName = "MaMH" , insertable = false , updatable = false)
	private Item item;
	
	@Column(name = "HinhAnh")
	private String image;
	@Column(name = "GiaBan")
	private Double salesPrice;
	@Column(name = "GiaMua")
	private Double buyPrice;
	@Column(name = "SoLuong")
	private Integer amount;
	
	@Embeddable
	public static class Id implements Serializable {
		private static final long serialVersionUID = -1475260684070712139L;
		@Column(name = "MaMH" , nullable = false )
		private Integer itemId;

		@Column(name = "MaKC" , nullable = false)
		private String sizeId;
		
		public Id() {
			// TODO Auto-generated constructor stub
		}

		public Id(Integer itemId, String sizeId) {
			super();
			this.itemId = itemId;
			this.sizeId = sizeId;
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

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", sizeId=" + sizeId + "]";
		}
		
	}
	
	public ItemDetail() {
		// TODO Auto-generated constructor stub
	}

	public ItemDetail(Id id, String image, Double salesPrice, Double buyPrice, Integer amount) {
		super();
		this.id = id;
		this.image = image;
		this.salesPrice = salesPrice;
		this.buyPrice = buyPrice;
		this.amount = amount;
	}

	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemDetail [id=" + id + ", image=" + image + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice
				+ ", amount=" + amount + "]";
	}
	
	
}
