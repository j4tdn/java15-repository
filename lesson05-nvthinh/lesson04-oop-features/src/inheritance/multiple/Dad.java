package inheritance.multiple;

public interface Dad {
	void choike();
	void playPS5();
	default void choibai() {
		System.out.println("ao ma canada");
	}
}
