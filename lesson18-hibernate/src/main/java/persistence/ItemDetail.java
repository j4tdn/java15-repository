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
	private Id Id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaMH", referencedColumnName = "MaMH",insertable = false, updatable = false)
	private Item item;
	
	@Column(name = "HinhAnh")
	private String image;
	@Column(name =  "GiaBan")
	private Double salesPrice;
	
	@Column(name =  "GiaMua")
	private Double buyPrice;
	
	@Column(name = "SoLuong")
	private Integer amount;
	/**
	 * 
	 */
	public ItemDetail() {
	}
	
	public Id getId() {
		return Id;
	}

	public void setId(Id id) {
		Id = id;
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
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "ItemDetail [Id=" + Id + ", image=" + image + ", salesPrice=" + salesPrice + ", buyPrice=" + buyPrice
				+ ", amount=" + amount + "]";
	}


	@Embeddable
	public static class Id implements Serializable{
		private static final long serialVersionUID = -1475260684070712139L;
		@Column(name = "MaMH", nullable = false)
		private Integer itemId;
		
		@Column(name = "MaKC", nullable = false)
		private String SizeIdld;
		
		/**
		 * Empty constructor
		 */
		public Id() {
			// TODO Auto-generated constructor stub
		}

		public Id(Integer itemId, String sizeIdld) {
			this.itemId = itemId;
			SizeIdld = sizeIdld;
		}

		public Integer getItemId() {
			return itemId;
		}

		public void setItemId(Integer itemId) {
			this.itemId = itemId;
		}

		public String getSizeIdld() {
			return SizeIdld;
		}

		public void setSizeIdld(String sizeIdld) {
			SizeIdld = sizeIdld;
		}

		@Override
		public String toString() {
			return "Id [itemId=" + itemId + ", SizeIdld=" + SizeIdld + "]";
		}
		
		
	}
}
