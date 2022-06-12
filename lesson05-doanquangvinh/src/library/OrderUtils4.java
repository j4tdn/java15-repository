package library;

public class OrderUtils4 {
	private OrderUtils4() {
		// TODO Auto-generated constructor stub
	}
	public static double Sum(ReferenceBook rb , TextBook tb) {
		double totalOfMoney = 0;
		double idCost1 = tb.getPrice(); 
		if (tb.getCondition() == Condition.Old) {
			idCost1*= 0.7;
		}
		double idCost2 = rb.getPrice()*(0.01 + rb.getTax());
		return totalOfMoney = idCost1 + idCost2;
	}
}
