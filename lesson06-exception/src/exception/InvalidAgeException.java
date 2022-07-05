package exception;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
	}

	public InvalidAgeException(int fromAge) {
		super("Age is invalid - At least " + fromAge + "!!!");
	}
}
