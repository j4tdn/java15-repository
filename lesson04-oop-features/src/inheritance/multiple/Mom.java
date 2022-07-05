package inheritance.multiple;

public interface Mom {
	void dibar();
	void playPS5();
	default void choibai() {
		System.out.println("ao ma canada haha");
	}
}
