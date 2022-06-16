package view;

public class Ex03TrianglePascal {
	public static void main(String[] args) {
		int input=4;// Heigh of triangle
		int x, output;
		for(int i=1; i<=input; i++) {
			for(int j=0; j<= 2*input; j++) {
				x=j-input;
				if(x<0) {
					x*=-1;
				}
				output=i-x;
				if(output>0) {
					System.out.printf("%3d",output);
				}else {
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
		
	}
	

}
