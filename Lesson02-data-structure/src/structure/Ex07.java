package structure;

// Hoan vi 2 phan tu so nguyen(int , Integer )
public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 36;
//Case1 : Code truc tiep trong ham main
		int tmp = a; // tmp = 5
		a = b; // a= 7 , b=7
		b = tmp; // a=7 , b=5
		System.out.println("a: " + a);
		System.out.println("b: " + a);
		swap (a,b);
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("SWAP");
	}

	// Cas2 : Tao ra method co the tai su dung
	// f = a =12
	// s = b = 36
	private static void swap(int f, int s) {
int tmp = f ;
f = s ;
s = tmp;
	}

}
