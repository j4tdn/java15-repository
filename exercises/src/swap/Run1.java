package swap;

public class Run1 {
	public static void main(String[] args) {
		Heap a = new Heap(5);
		Heap b = new Heap(7);
		swap(a, b);
		System.out.println(a.getN() +" " + b.getN());
	}
	
	private static void swap(Heap a, Heap b) {
		int temp = a.getN();
		a.setN(b.getN());
		b.setN(temp);
	}
}
