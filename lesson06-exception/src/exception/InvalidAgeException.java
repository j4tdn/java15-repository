package exception;

public class InvalidAgeException extends RuntimeException {

	private static final long serialVersionUID = -8639637553249410321L;
	
	
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAgeException(int fromAge) {
		super("Age is invalid - At least " + fromAge + "!!!");
	}
	
	

}