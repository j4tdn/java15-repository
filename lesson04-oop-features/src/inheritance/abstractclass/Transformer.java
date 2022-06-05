package inheritance.abstractclass;

public interface Transformer {
	default void sending(boolean isSafe) {
		System.out.println("");
	};
}
