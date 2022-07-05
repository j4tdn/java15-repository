package exception;

public class LackofAtLeastOneNumber extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7790261130425326045L;
    
	public LackofAtLeastOneNumber() {
		// TODO Auto-generated constructor stub
	}
	
    public LackofAtLeastOneNumber(String message) {
    	super("Require at least one number " + message);
    }
}
