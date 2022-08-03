package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);
	     String name = null;
	     boolean flag = true;
	     while (flag) {
			System.out.print("Nhập họ và tên :");
		    name = ip.nextLine();
		    if (name.matches("[a-zA-Z\s]{1,}")) {
				 System.out.println(name);
				 System.out.println(convert(name));
				 flag = false;
			}
		}
	}
	private static String convert(String name) {
		String tmp = "";
	    String[] arrays = name.split("\s+");
	    for (int i = 0; i < arrays.length; i++) {
			arrays[i] = arrays[i].valueOf(arrays[i].charAt(0)).toUpperCase() + arrays[i].substring(1).toLowerCase() ;
			tmp+= arrays[i]+" ";
		}
	    return tmp;
	}
}
