package bkit.java15.service;

// Demo AspectJ --> JoinPoint
public class StoreService {
	
	public void addStore() {
		System.out.println(".... " + getClass().getName() + " ... adding store ...");
	}
	
	public void updateStore(int newAmountOfItems) {
		System.out.println(".... " + getClass().getName() + " ... updating store with new amount " + newAmountOfItems + "...");
	}
	
	public String getStoreName() {
		System.out.println(".... " + getClass().getName() + " ... getting store name '123' ...");
		return "Store 123";
	}
	
}
