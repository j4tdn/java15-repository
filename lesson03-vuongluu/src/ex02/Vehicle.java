package ex02;

import java.text.DecimalFormat;

public class Vehicle {
	public static void main(String[] args) {
		Person p1 = new Person("Nguyễn Thu Loan");
		Person p2 = new Person("Lê Minh Tính");
		Person p3 = new Person("Nguyễn Minh Triết");
		Car c1 = new Car("Future Neo", 100, 35000000);
		Car c2 = new Car("Ford Ranger", 3000, 250000000);
		Car c3 = new Car("Landscape", 500, 1000000000);
		Order o1 = new Order(p1, new CarDetail[] { new CarDetail(c1, 1) });
		Order o2 = new Order(p2, new CarDetail[] { new CarDetail(c2, 1) });
		Order o3 = new Order(p3, new CarDetail[] { new CarDetail(c3, 1) });

		System.out.printf("%-25s%-20s%-20s%-20s%s\n", "Tên Chủ Xe", "Loại xe", "Dung Tích", "Trị Giá", "Thuế Phải Nộp");
		System.out.println("=======================================================================================================");
		printf(o1);
		printf(o2);
		printf(o3);
	}

	public static void printf(Order order) {
		for(CarDetail od : order.getCarDetails() ) {
			DecimalFormat df = new DecimalFormat("#,###");
			System.out.printf( "%-25s",order.getPerson());
				System.out.printf( "%-20s",od );
					System.out.printf("%s\n",df.format(Utils.export(order)));
				
		}
		
	}
}
