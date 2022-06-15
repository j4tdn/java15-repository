package Ex04;

import java.util.Scanner;

public class AppManage {
	public static Scanner ip = new Scanner(System.in);

	public static void InputManual(Manual mn) {
		System.out.println("\nNhap ten: ");
		mn.setName(ip.nextLine());
		System.out.println("\nNhap ngay sinh: ");
		mn.setBirthday(ip.nextLine());
		System.out.println("\nNhap thu nhap: ");
		mn.setIncome(Float.parseFloat(ip.nextLine()));
	}

	public static void InputDirector(Director dt) {
		InputManual(dt);
		System.out.println("\nNhap he so chuc vu");
		dt.setPlus(Float.parseFloat(ip.nextLine()));
	}

	public static void InputChief(Chief f) {
		InputManual(f);
		System.out.println("\nNhap so luong nhan vien quan ly");
		f.setNumstaff(Integer.parseInt(ip.nextLine()));
	}

	public static void InputStaff(Staff tf) {
		InputManual(tf);
		System.out.println("\nNhap ten don vi");
		tf.setDeparment(ip.nextLine());
	}

	public static void main(String[] args) {
		Director dt = null;
		Chief f = null;
		Staff tf[] = null;
		float total = 0;

		int a;
		boolean flag = true;
		do {
			System.out.println("\n------------------MENU----------------");
			System.out.println("\n1. Nhap du lieu");
			System.out.println("\n2. Hien thi thong tin nhan su");
			System.out.println("\n3. In ra muc luong");
			System.out.println("\n4. Thoat");
			System.out.println("Moi nhap a: ");
			a = Integer.parseInt(ip.nextLine());
			switch (a) {
			case 1:
				System.out.println("\nNhap thong tin giam doc");
				dt = new Director();
				InputDirector(dt);
				System.out.println("\nNhap thong tin truong phong");
				f = new Chief();
				InputChief(f);
				System.out.println("\nNhap thong tin nhan vien");
				tf = new Staff[2];
				for (int i = 0; i < 2; i++) {
					tf[i] = new Staff();
					InputStaff(tf[i]);
				}
				break;
			case 2:
				System.out.println("--------------------------THÔNG TIN GIÁM ĐỐC---------------------------------");
				System.out.printf("%-22s %10s %10s %10s \n", "Họ và tên", "Ngày sinh", "Thu nhập", "Hệ số chức vụ");
				dt.DisplayDirector();
				System.out.println("-------------------------THÔNG TIN TRƯỞNG PHÒNG-------------------------------");
				System.out.printf("%-22s %10s %10s %10s \n", "Họ và tên", "Ngày sinh", "Thu nhập", "Số lượng nhân viên");
				f.DisplayChief();
				System.out.println("--------------------------THÔNG TIN NHÂN VIÊN---------------------------------");
				System.out.printf("%-22s %10s %10s %10s \n", "Họ và tên", "Ngày sinh", "Thu nhập", "Tên đơn vị");
				for(int i = 0; i < 2; i++) {
					tf[i].DisplayStaff();
				}
				break;
			case 3:
				System.out.println("Lương giám đốc: ");
				dt.Directotal();
				System.out.println("Lương trưởng phòng");
				f.Chieftotal();
				System.out.println("Lương nhân viên");
				for(int i = 0; i < 2; i++) {
					total += tf[i].Stafftotal();
				}
				System.out.println(total);
				break;
			default:
				System.out.println("Thoat");
				flag = false;
				break;
			}
		} while (flag);
	}
}
