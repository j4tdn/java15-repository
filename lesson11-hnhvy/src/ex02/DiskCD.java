package ex02;

import java.util.Objects;

public class DiskCD {
	private int idCD;
	private String typeCD;
	private String singer;
	private int numberOfSong;
	private double price;

	public DiskCD() {

	}

	public DiskCD(int idCD, String typeCD, String singer, int numberOfSong, double price) {
		super();
		this.idCD = idCD;
		this.typeCD = typeCD;
		this.singer = singer;
		this.numberOfSong = numberOfSong;
		this.price = price;
	}

	public int getIdCD() {
		return idCD;
	}

	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberOfSong() {
		return numberOfSong;
	}

	public void setNumberOfSong(int numberOfSong) {
		this.numberOfSong = numberOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		if( this == o) {
			return true;
		}
		if(!(o instanceof DiskCD)) {
			return false;
		}
		DiskCD that = (DiskCD)o;
		return getIdCD() == that.getIdCD();
	}
	
	@Override
	public String toString() {
		return "DiskCD [idCD=" + idCD + ", typeCD=" + typeCD + ", singer=" + singer + ", numberOfSong=" + numberOfSong
				+ ", price=" + price + "]";
		
}
}
	