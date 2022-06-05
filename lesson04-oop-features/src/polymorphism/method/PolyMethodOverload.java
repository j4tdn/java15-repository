package polymorphism.method;

public class PolyMethodOverload {
	public static void main(String[] args) {
		int x = 5; 
		int y = 10; 
		int z = 15 ; 
		System.out.println("sum 2:" + sum(x, y)) ;
		System.out.println("sum 2:" + sum(5.0f, 2.0f)) ;
		System.out.println("sum 3:" + sum(x, y ,z)) ;
	}
	// Hàm có thể trùng tên bên trong một class miễn là khác số lượng tham số truyền vào hoặc kiểu dữ liệu
	private static float sum(float a, float b) {
		return a+b;
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	
}
