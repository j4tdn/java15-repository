package structure;

public class Ex05 {
	public static void main (String[] args) {
		//KDL nguyen thuy
		// +int , float, double, char --> STACK
		// + luu tru duoc single value, gia tri don
		//+ khoi tao gia tri thi dung toan tu --> int a = 5;
		
		//KDL doi tuong
		// KDL doi tuong co san cua JAVA: String, Integer, Float
		// KDL do minh taoj ra: Item, Employee, Student
		// khoi tao gia tri thi dung toan tu new de tao ra o nho o HEAP
		
		// int vs Integer
		
		// int  --->STACK, luon luon co gia tri
		//       ---> luu tru
		
		//Integer --->Heap, co the co gia tri hoac khoong NULL
		//             luu tru, ho tro cac phuong thuc huu ich
		char letter = 'A';
		System.out.println("Letter: " + letter);
		
		Character character = new Character('B');
		System.out.println("character: " + character);
		System.out.println("checking: " + Character.isAlphabetic(letter));
		
		String input = "25a3615";
		System.out.println("isNumber: " + input.matches("\\d+"));
	}

}
