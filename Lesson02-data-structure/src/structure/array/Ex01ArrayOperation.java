package structure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		// index : 0 1 2 3 4 5
		// value : 0 0 0 0 0 0
		int[] numbers = new int[6];
		numbers[3] = 25;
//    System.out.println("Index 3 :" + numbers[3]);
// forindex : duyet thong qua index
// foreach : duyet thong qua cac elements
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at Index  " + i + ":" + numbers[i]);
		}
		System.out.println("============================================");
// foreach : Duyet thong qua cac phan tu
		for (int element : numbers) {
			System.out.println("number :" + element);
		}
		System.out.println("============================================");
		String [] sequences = {"hello" , " hi" , "welcome"};
		System.out.println("Length" + sequences.length);
		for(String sequence : sequences) {
			System.out.println(" Sequence   " + sequence);
		}
	}
}
