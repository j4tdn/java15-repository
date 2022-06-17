package structure.array;

public class Ex01 {
// mangr 
	public static void main(String[] args) {
		
				int []numbers = new int [6];
				numbers[3]=25;
	System.out.println("index 3: "+numbers);
	for(int i = 0; i<numbers.length;i++) {
		System.out.println("index : "+numbers[i] );
		/// foreach
		System.out.println("===========================" );

		}
	for(int number: numbers) {
		System.out.println("number: "+number);
		//: toán tử gán

	}
	System.out.println("============================= ");
	
	String[]sequences = {"hello","hi","yeu em"};
	System.out.println("length: "+sequences.length);
	for(String sequence: sequences) {
		System.out.println(sequence);
	}
	}
	

}
