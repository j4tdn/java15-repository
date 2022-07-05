package exception;

public class LackofAtLeastOneUpperCase extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6609353987894481817L;
    public LackofAtLeastOneUpperCase() {
		// TODO Auto-generated constructor stub
	}
    public LackofAtLeastOneUpperCase(String message) {
    	super("Require at least one upper case letter" + message);
    }
}
