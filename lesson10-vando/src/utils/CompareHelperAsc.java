package utils;

public class CompareHelperAsc implements CompareIntHelper {
	@Override
	public boolean compare(int pre, int next) {
		return pre > next;
	}
}