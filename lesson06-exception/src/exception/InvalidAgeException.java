package exception;

public class InvalidAgeException extends RuntimeException {
	private static final long serialVersionUID = -8639637553249410321L;

	public InvalidAgeException() {

	}

	public InvalidAgeException(String fromAge) {
		super("Age is invalid - At least " + fromAge + "!!!");
	}

}
