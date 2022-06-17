package loop;

public class Ex01for {
	public static void main(String[] args) {
		int n =100;
		for(int i =0; i<n ;i++) {
			System.out.print(i +"\t");
			if(i %12 == 0) {
				System.out.println();
			}
		}
		//zero-index
		String[] elements = {"a","b","c"};
		System.out.println();
		for(int i =0 ;i<elements.length;i++) {
			
			System.out.println(elements[i]);
		}
			for(String element: elements) {
				
				System.out.println(element);
			}
		}
	}


