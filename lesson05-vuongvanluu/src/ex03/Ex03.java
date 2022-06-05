package ex03;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("asdsd342gsdfg"));
	}
	public static int getMaxValidNumber(String a) {
		int n = 0;
		for(int i=0;i<a.length();i++) {
			if((a.charAt(i)>0 && a.charAt(i)<9)) {
				n = (int) a.charAt(i);
			}
		}
		return n;
	}
}
