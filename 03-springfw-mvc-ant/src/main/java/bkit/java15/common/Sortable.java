package bkit.java15.common;

import java.util.Map;

public class Sortable {
	
	// url-field, entity-field
	public static Map<String, String> CUSTOMER_PROPS = 
			Map.of("first-name", "firstName",
				   "last-name", "lastName",
				   "email", "email");
	
	private String sortField;
	private String sortDir;
	
	public Sortable() {
	}

	public Sortable(String sortField, String sortDir) {
		this.sortField = sortField;
		this.sortDir = sortDir;
	}
	
	public static Sortable of(String sortField, String sortDir) {
		return new Sortable(sortField, sortDir);
	}

	public String getSortField() {
		return sortField;
	}

	public String getSortDir() {
		return sortDir;
	}

	@Override
	public String toString() {
		return "Sortable [sortField=" + sortField + ", sortDir=" + sortDir + "]";
	}
	
}
