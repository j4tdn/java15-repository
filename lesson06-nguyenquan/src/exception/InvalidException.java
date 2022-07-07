package exception;

public class InvalidException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public InvalidException() {
		
	}
	public InvalidException(String string ) {
	   super(string);
	}
	

}
