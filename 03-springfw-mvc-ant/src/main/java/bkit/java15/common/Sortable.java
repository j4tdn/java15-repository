package bkit.java15.common;

import java.util.Map;

public class Sortable {
	
	// K: urlParamSortField
	// V: entitySortField
	public static final Map<String, String> CUSTOMER_PROPS = 
			Map.of("first-name", "first_name",
					"last-name", "last_name",
					"email", "email");

	private String sortField;
	private String sortDir;

	private Sortable(String sortField, String sortDir) {
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

}
