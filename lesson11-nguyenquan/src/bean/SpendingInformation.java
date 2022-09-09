package bean;

public class SpendingInformation {
	private String expenditures;
	public SpendingInformation() {


	}
	public SpendingInformation(String expenditures) {
		this.expenditures = expenditures;
	}
	public String getExpenditures() {
		return expenditures;
	}
	public void setExpenditures(String expenditures) {
		this.expenditures = expenditures;
	}
	@Override
	public String toString() {
		return "SpendingInformation [expenditures=" + expenditures + "]";
	}
	
	
    
	

}
