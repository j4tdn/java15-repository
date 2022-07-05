package exception;

public class LackofSpecialCharacter extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3222587755681665780L;
    
	public LackofSpecialCharacter() {
		// TODO Auto-generated constructor stub
	}
	public LackofSpecialCharacter(String message) {
		super("Require at least one special character" + message);
	}
}
