package utils;
//một interface có 1 hàm duy nhất thì ta gọi đó là :
// với 1 @FunctionalInterface thì thay vì phải new interface and override thì ta có thể sử dụng lambda để nó làm
// lambda
@FunctionalInterface
public interface CompareIntHelper {
	boolean compare(int pre, int next);
	
}
