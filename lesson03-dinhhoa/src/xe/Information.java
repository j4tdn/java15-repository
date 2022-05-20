package xe;

import java.util.Scanner;

public class Information {
	static Scanner sc = new Scanner(System.in);
	static void nhapXe(Vehicle xe){
	
	    System.out.print("Nhập tên chủ xe: ");
	        xe.setChuXe(sc.nextLine());sc.nextLine();
	    System.out.print("Nhập loại xe: ");
	    	xe.setLoaiXe(sc.nextLine());
	    System.out.print("Nhập dung tích xe: ");
	        xe.setDungTich(sc.nextInt());
	    System.out.print("Nhập giá trị xe: ");
	        xe.setGiaTri(sc.nextDouble());;sc.nextLine();
	    }
	    public static void main(String[] args) {
	        Vehicle v[]= null;
	        int a,n=0;
	        boolean flag = true;
	        do{
	            a =sc.nextInt();
	            switch (a){
	                case 1:
	                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
	                    n=sc.nextInt();
	                    v= new Vehicle[n];
	                    for (int i = 0; i < n; i++) {
	                        System.out.println("Xe thứ " + (i+1));
	                        v[i] = new Vehicle();
	                        nhapXe(v[i]);
	                    }
	                    break;
	                case 2:
	                    System.out.printf("%10s %10s %10s  %10s %10s \n","Chủ xe","Loại xe","Dung tích","Trị giá","Thuế");
	                    for (int i = 0; i < n; i++) {
	                        v[i].inThue();
	                    }
	                    break;
	                default:
	                    System.out.println("exit program");
	                    flag=false;
	                    break;
	            }
	        }while (flag);
	   }
}
