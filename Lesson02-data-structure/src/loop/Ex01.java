package loop;

import javax.lang.model.element.Element;

public class Ex01 {
public static void main(String[] args) {
	int n= 100;
	for (int i =0; i < n; i++) {
		System.out.print(i +" ");
		if (i% 12 ==0) {
			System.out.println();
		}
	}
	//zero index
	String [] elements = {"A","B", "C"};
	for( int i =0 ; i < elements.length; i++) {
		System.out.println(elements[i]);
	}
	for( String element:elements) {
		System.out.println(element);
	}
}
}
