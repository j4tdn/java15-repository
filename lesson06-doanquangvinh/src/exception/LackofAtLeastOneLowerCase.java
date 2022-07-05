package exception;

public class LackofAtLeastOneLowerCase extends Exception  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5122085268137013354L;
    public LackofAtLeastOneLowerCase() {
		// TODO Auto-generated constructor stub
	}
    public LackofAtLeastOneLowerCase(String message) {
    	super("Require At Least one lower case character" + message);
    }
}
