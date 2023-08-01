package bkit.java15.service;

import bkit.java15.common.Catalog;

public class MovieService {
	
	private String name;
	private Catalog catalog;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	// join point methods
	public void printName() {
		System.out.println(">>> " + getClass().getName() + " -->" + name);
	}
	
	public void printMovieCatalog() {
		System.out.println(">>> " + getClass().getName() + " -->" + catalog);
	}
	
	public void insertMovie() {
		System.out.println("Inserting...nothing to database !!!");
	}
}
