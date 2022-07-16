package inheritance.multiple;

public interface Dad {
	void smoking();
	void playSport();
	
	default void gaming() {
		System.out.println("play fifa");
	}
}
