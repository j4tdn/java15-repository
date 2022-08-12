package utils;

public class CompareHelperAsc implements CompareHelper {
	@Override
	public boolean compare(int pre, int next) {
		return pre > next;
	}
}
