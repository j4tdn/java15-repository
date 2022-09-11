package utils;
//interface có hàm trừu tượng -> funtional interface
@FunctionalInterface
public interface CompareIntHelper {
	boolean compare(int pre, int next);
	//funtional interface
	//instead of new Interface and overide abstract method to create a interface instance
	//using lambda expression to create an instance of funtional interface
}
