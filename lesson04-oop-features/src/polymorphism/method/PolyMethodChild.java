package polymorphism.method;

public class PolyMethodChild extends PolymethodParent {
	
		public static void main(String[] args) {
			PolymethodParent parent = new PolyMethodChild();
			
			System.out.println(parent.text);
			parent.log();
		}
		
		String text = "child ====> text";
		void log() {
			System.out.println("text =====> Child");
		}
}
