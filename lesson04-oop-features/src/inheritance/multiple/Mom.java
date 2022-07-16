package inheritance.multiple;

public interface Mom {
	void shopping();
	void playSport();
	
	default void gaming() {
		System.out.println("play audition");
	}
}
