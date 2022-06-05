package view;

public class Sgk  extends Book{


	private String status;

	public Sgk() {
		// TODO Auto-generated constructor stub
	}

	public Sgk(String id, double price, String nsb, String status) {
		super(id, price, nsb);
		this.status = status;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Sgk [status=" + status + "]";
	}



}
