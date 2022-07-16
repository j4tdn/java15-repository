package exception;

public class InvalidAgeException extends Exception{
	private static final long serialVersionUID = -8639637553249410321L;
	
	public InvalidAgeException() {
	}
	
	public InvalidAgeException(int fromAge) {
		super("Age is invalid - At least " + fromAge + "!!!");
	}
}