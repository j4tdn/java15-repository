package exception;

public class InvalidAgeException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidAgeException() {
		
	}
	 
	public InvalidAgeException(int fromAge) {
		super("Age is invalid - At least" + fromAge + "!!!");
		
	}
}
