package exception;

public class LackofCharacters extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4103570973877405825L;
    public LackofCharacters() {
		// TODO Auto-generated constructor stub
	}
    public LackofCharacters(String message) {
    	super("Require at least 8 characters  and  less than 256 characters" + message);
    }
}
