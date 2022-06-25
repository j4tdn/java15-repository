package inheritance.Multiple;

public interface Dad {
	void smoking();
	void playSport();
	default void gaming() {
		System.out.println("play fifa");
	}
}
