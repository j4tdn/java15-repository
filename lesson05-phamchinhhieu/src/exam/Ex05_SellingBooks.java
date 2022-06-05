package exam;

import bean.Customer;
import bean.ReferenceBooks;
import bean.TextBook;

public class Ex05_SellingBooks {
	public static void main(String[] args) {
		Customer cus = new Customer();

		TextBook tb1 = new TextBook("SGK01", "Nhi Dong", "Moi", 15);
		TextBook tb2 = new TextBook("SGK02", "GD", "Moi", 100);
		TextBook tb3 = new TextBook("SGK03", "Kim Dong", "Cu", 120);

		TextBook[] tb = { tb1, tb2, tb3 };

		ReferenceBooks rb1 = new ReferenceBooks("STK01", "Nhi Dong", 10, 0.3);
		ReferenceBooks rb2 = new ReferenceBooks("STK02", "GD", 80, 0.1);

		ReferenceBooks[] rb = { rb1, rb2 };

		System.out.println("Bo sach thuoc nha xuat bang Nhi Dong Dong la: ");
		SearchPublisher(tb, rb);
		System.out.println("===============================");
		System.out.println("Bo sach co don gia be hon 50 la: ");
		SearchPrice(tb, rb);
		System.out.println("===============================");
		System.out.println("Bo sach co don gia lon hon 100 va nho hon 200 la: ");
		SearchPrice1(tb, rb);

		cus.setTexcus(tb3);
		cus.setRefcus(rb1);

		System.out.println("===============================");
		System.out.println("Tong so tien phai tra khi mua sach " + cus.getTexcus().getIdBook() + " va sach "
				+ cus.getRefcus().getIdbook() + " la :" + CashBook(cus));

	}

	private static void SearchPublisher(TextBook[] tb, ReferenceBooks[] rb) {
		for (int i = 0; i < tb.length; i++) {
			if (tb[i].getPublishes() == "Nhi Dong") {
				System.out.println(tb[i].toString());
			}
		}
		for (int i = 0; i < rb.length; i++) {
			if (rb[i].getPublisher() == "Nhi Dong") {
				System.out.println(rb[i].toString());
			}
		}
	}

	private static void SearchPrice(TextBook[] tb, ReferenceBooks[] rb) {
		for (int i = 0; i < tb.length; i++) {
			if (tb[i].getPrice() < 50) {
				System.out.println(tb[i].toString());
			}
		}
		for (int i = 0; i < rb.length; i++) {
			if (rb[i].getPrice() < 50) {
				System.out.println(rb[i].toString());
			}
		}
	}

	private static void SearchPrice1(TextBook[] tb, ReferenceBooks[] rb) {
		for (int i = 0; i < tb.length; i++) {
			if (tb[i].getPrice() > 100 && tb[i].getPrice() < 200) {
				System.out.println(tb[i].toString());
			}
		}
		for (int i = 0; i < rb.length; i++) {
			if (rb[i].getPrice() > 100 && rb[i].getPrice() < 200) {
				System.out.println(rb[i].toString());
			}
		}
	}

	private static double CashBook(Customer cus) {
		double price = 0;
		if (cus.getTexcus().getStatus() == "Cu") {
			price += cus.getTexcus().getPrice() * 0.7;
			System.out.println(price);
			price += cus.getRefcus().getPrice() * (1 + cus.getRefcus().getTax());
		} else {
			price += cus.getTexcus().getPrice();
			price += cus.getRefcus().getPrice() * (1 + cus.getRefcus().getTax());
		}
		return price;
	}
}
