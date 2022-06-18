package staffmanagementment;

import java.time.LocalDate;

public class App {
 public static void main(String[] args) {
	Person director = new Director("nguyen van thinh", LocalDate.of(2002, 1, 10), 3.0f, 4.0f);
	Person manager  = new Manager("tran van thinh", LocalDate.of(2002, 9, 16), 2.3f, 2);
	Person staff1 = new Staff("nguyen van nam", LocalDate.of(2002, 07, 02),1.1f , "thiet ke");
	Person staff2 = new Staff("nguyen thi lan", LocalDate.of(2002, 10, 10), 1.2f, "nhan su");
	Person[] persons = {director,manager,staff1,staff2};
	for(int i = 0; i< persons.length;i++) {
		System.out.println(persons[i].toString());
	}
	
	for(int i = 0;i<persons.length;i++) {
		System.out.println("tong so luong la cua "+persons[i].getName()+ " : "+persons[i].calculationOfWages());
	}

}
}
