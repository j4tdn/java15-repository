package exercises;

//B1: Đếm xem trong chuỗi " FaBcD172#@! " sau đây có bao nhiêu kí tự in Hoa, Thường và Số.
public class Ex01 {
	public static void main(String[] args) {
		String input="FaBcD172#@";
		int countx=0;
		int countX=0;
		int countNum=0;
		
		char c;
		for(int i=0; i<input.length(); i++) {
			c=input.charAt(i);
			if(c>='a' && c<='z') {
				countx++;
			}
		}
		for(int i=0; i<input.length(); i++) {
			c=input.charAt(i);
			if(c>='A' && c<='Z') {
				countX++;
			}
		}
		
		
		
		System.out.println("Số kí tự in thường: "+ countx);
		System.out.println("Số kí tự in hoa: "+ countX);
	}
}
