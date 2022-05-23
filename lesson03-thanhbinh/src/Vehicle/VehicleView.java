package Vehicle;

import Vehicle.Vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VehicleView {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a, n = 0;
        Vehicle[] vhc = null;
        Boolean exit = true;

        do {
            System.out.println("1. Nhập thông tin và tạo N đối tượng xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
            System.out.println("3. Thoát.");
            a = Integer.parseInt(ip.nextLine());
            switch (a) {
                case 1:
                    System.out.print("Nhập số lượng xe: ");
                    n = Integer.parseInt(ip.nextLine());
                    vhc = new Vehicle[n];

                    for (int i = 0; i < n; i++) {
                        vhc[i] = new Vehicle();
                        System.out.println("Nhập thông tin");
                        System.out.println("Tên chủ xe: ");
                        vhc[i].setNameCarOwner(ip.nextLine());
                        System.out.println("Loại xe: ");
                        vhc[i].setType(ip.nextLine());
                        System.out.println("Dung tich: ");
                        vhc[i].setCapacity(Integer.parseInt(ip.nextLine()));
                        System.out.println("trị giá: ");
                        vhc[i].setValue(Double.parseDouble(ip.nextLine()));
                    }
                    break;

                case 2:
                    System.out.printf("|%-20s | %-15s | %-15s | %-20s | %-20s %n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                    System.out.println("=====================================================================================");
                    for (Vehicle car : vhc) {
                        DecimalFormat df = new DecimalFormat("####.00");
                        System.out.printf("|%-20s | %-15s | %-15s | %-20s | %-20s %n", car.getNameCarOwner(), car.getType(), car.getCapacity(), df.format(car.getValue()), df.format(Vehicle.calculatoTax(car)));

                        break;

                    }
                case 3:
                    exit = false;
                    break;
            }
        }while (exit) ;

    }

}
