package bkit.java15.service;

import bkit.java15.common.Catalog;

public class MovieCatalog {
	
	private Catalog catalog;
	
	public MovieCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public void recommend() {
		switch(catalog) {
			case ACTION:
				System.out.println("If you like 'ACTION' movie, we would like to suggest watching 'ACTION 123' series");
				break;
			case ADVENTURE:
				System.out.println("If you like 'ADVENTURE' movie, we would like to suggest watching 'ADVENTURE 789' series");
		}
	}
}
