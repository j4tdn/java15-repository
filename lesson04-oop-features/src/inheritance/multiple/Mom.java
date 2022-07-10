package inheritance.multiple;

public interface Mom {
	void shopping();
	void playSpOrt();
	
	default void gaming() {
		System.out.println("Play Audition");
	}
}
