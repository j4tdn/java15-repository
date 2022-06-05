package view;

public class Stk extends Book{
	
	private double tax;

	
	
	public Stk() {
		// TODO Auto-generated constructor stub
	}



	public Stk(String id, double price, String nsb, double tax) {
		super(id, price, nsb);
	
		this.tax = tax;
	}






	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}



	@Override
	public String toString() {
		return "Stk [tax=" + tax + "]";
	}


}
