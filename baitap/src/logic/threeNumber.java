package logic;

public class threeNumber {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if(i + j ==  k * k) {
						System.out.println(i + "" +j+ "" + k);
					}
				}
			}
		}
	}
}
