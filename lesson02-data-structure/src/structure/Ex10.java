package structure;

import bean.CustomInteger;

// Hoán vị 2 phần tử 
public class Ex10 {
    public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger  b = new CustomInteger(36);
		// khởi tạo 1 đối tượng dùng new
		// 1 class, đối tượng của java mình tạo ra bắt buộc để tạo đối tượng trên head --> thì new ra
		// integer có thể cho 2 cách còn CustomInteger thì không vì:
		// 1. integer do java tạo ra --> chắc chắn trong integer có 1 thuộc tính ở bên trong
		// 2. CustomInteger là 1 class ,1 đối tượng do mình tạo ra
		//  đối tượng do mình tạo ra chưa chắc có 1 thuộc tính, không biết chắc chắn nên không thể làm 
		
		System.out.println("a: " + a);//12
	    System.out.println("b: " + b);//36
	    
	    swap(a, b);
	    System.out.println("====AFTER SWAP====");
	    
	    System.out.println("a: " + a);
	    // 12
	    System.out.println("b: " + b);
	    // 36
    }
    // CASE 3 ==> Create a METHOD for reusable with custom class
    // CustomInteger f = a 12
    // CustomInteger s = b 36 ===> PASS BY VALUE
    public static void swap(CustomInteger f, CustomInteger s) {
    	int tmp = f.value; // tmp = 12, fv = 12
    	f.value = s.value;// fv = 36, sv= 26
    	s.value = tmp;// sv = 12
    	// f = 36
    	// s = 12
    	System.out.println("f: " + f);
    	System.out.println("s: " + s);
		
	}
	}

