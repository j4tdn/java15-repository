package operator;

public class Ex02Interview {
 public static void main(String[] args) {
	 int count = 0;
	 if (count > 0 && count++ > 1) {
		 System.out.println("step 1: " + count++);//
		 // && khi car 2 thằng đúng ==> vẫn được thực thi
	 }
	 if (count >= 1 || ++count > 2){
		 System.out.println("step 2: " + count);//
		 // || 1 trong 2 thằng đúng sẽ được thực thi
	 }
	 if (count <= 2 && ++count >=4) {
		 System.out.println("step3: " + count--);//
	 }
	 System.out.println("step 4: " + count);//
	
}
}
    // VT && || VP

    // &&
// VT   VP   BLOCK
// F    X     X
// T    T     V
//T     F     X
// ||
// VT VP BLOCK
// T  X  V
//F   F  X
//F   T  T
//




