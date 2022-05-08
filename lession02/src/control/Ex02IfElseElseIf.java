package control;

public class Ex02IfElseElseIf {

	public static void main(String[] args) {
		String level = getLevel(6.8f);
		System.out.println("Level :" + level);

		
	}
	// validate: 0 <= score <=10
	private static  String getLevel(float score) {
		String result =  "";
		if( score <5 )
		{
			result = "kem";
		}
		else if(score < 6.5) {
			result = "trung binh";
		}
		else if(score < 8) {
			result = "kha";
		}
		else {
			result = "gioi";
		}
		return result;
		
	}

}
