package bean;

import java.time.LocalDate;

public class Leader extends People {
	private int quantityEmpl;
	
	public Leader() {
	}

	public Leader(String name, LocalDate birthday, int coefficoen, int quantityEmpl) {
		super(name, birthday, coefficoen);
		this.quantityEmpl = quantityEmpl;
	}

	public int getQuantityEmpl() {
		return quantityEmpl;
	}

	public void setQuantityEmpl(int quantityEmpl) {
		this.quantityEmpl = quantityEmpl;
	}

	@Override
	public String toString() {
		return "Leader "+super.toString()+" quantityEmpl=" + quantityEmpl + "]";
	}
	@Override
	public float salary() {
		return this.getCoefficoen() * 220000;
	}
}
