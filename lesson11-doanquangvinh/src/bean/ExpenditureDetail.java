package bean;

public class ExpenditureDetail {
	private String ExpenditurePurpose;

	public ExpenditureDetail() {
		// TODO Auto-generated constructor stub
	}

	public ExpenditureDetail(String expenditurePurpose) {
		super();
		ExpenditurePurpose = expenditurePurpose;
	}

	public String getExpenditurePurpose() {
		return ExpenditurePurpose;
	}

	public void setExpenditurePurpose(String expenditurePurpose) {
		ExpenditurePurpose = expenditurePurpose;
	}

	@Override
	public String toString() {
		return "ExpenditureDetail [ExpenditurePurpose=" + ExpenditurePurpose + "]";
	}

	public int compareTo(ExpenditureDetail key) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
