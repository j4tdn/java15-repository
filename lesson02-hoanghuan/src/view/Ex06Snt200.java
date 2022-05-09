package view;

public class Ex06Snt200 {
	public static void main(String[] args) {
		int dem=1;int i=2;
		while (dem<=200) {
			if (nt(i)) {
				dem++;
			}
			i++;
		}
		System.out.println("SNT thu 200: "+(i-1));
	}
	public static boolean nt(int n) {
		if (n<2) { return false;}
		for (int i = 2; i<=Math.sqrt(n); i++){
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
