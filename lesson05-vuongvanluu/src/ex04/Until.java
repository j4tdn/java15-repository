package ex04;

public class Until {
	public static double totalMoney(Book[] a) {
		double n=0;
		double m=0;
		double s=0;
		for(Book book:a) {
			if(book instanceof SgkBook) {
				SgkBook sgk = new SgkBook();
				sgk = (SgkBook)book;
				if(sgk.getStatus()=="cu") {
					n = sgk.getPrice()*70/100;
				}
				n=sgk.getPrice();
			}
			if(book instanceof StkBook) {
				StkBook stk = new StkBook();
				stk = (StkBook)book;
				m=stk.getPrice()*(100-stk.getTax()/100);
			}
		}
		s =m+n;
		return s;
	}
}
