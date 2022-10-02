package Ex01;

public interface Logic {
	@FunctionalInterface
	public interface Compare {
		boolean compare(int pre, int next);
	}
}
