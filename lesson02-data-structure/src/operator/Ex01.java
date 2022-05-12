package operator;

public class Ex01 {
	public static void main(String[] args) {
		// = == ++ -- && || !
	/*	int a=5;
		int b=2;
		System.out.println(a++);
		System.out.println(++a);
		
		System.out.println();
	
		int i=2;
		if(++i>2&&i++>2) {
			i++;
		}
		if(i++>4 || ++i>5) {
			System.out.println(i);	//6
		}
		if (i++<4||++i>5) {
			System.out.println(i);	//8
		}
	*/
		int x=0;int y=0;
		for(int z=0;z<5;z++) {
			if((++x>2)&&(++y>2)) {
				x++;
			}
		}
		System.out.println(x+ "  "+y);
	}
}
/* z	x	y
 * 0	1	0
 * 1	2	0
 * 2	3	1
 * 3	4	2
 * 4	6	3
 * 5
 */






