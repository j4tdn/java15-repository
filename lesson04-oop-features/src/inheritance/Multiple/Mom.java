package inheritance.Multiple;

public interface Mom {
	void shopping();
	void playSport();
	
	default void gaming() {
		System.out.println("play audition");
	}
}
