package bean;

public class Cards {
	  String type;
	    String num;

	    public Cards(String type, String num) {
	        this.type = type;
	        this.num = num;
	    }

	    @Override
	    public String toString() {
	        return num + ":" + type;
	    }
}
