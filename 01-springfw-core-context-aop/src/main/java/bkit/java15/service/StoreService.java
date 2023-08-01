package bkit.java15.service;


// Demo aspectJ -> join point
public class StoreService {
	
	public void addStore() {
		System.out.println("...." + getClass().getName() + "...adding store...");
	}
	
	public void updateStore(int newAmoutOfItems) {
		System.out.println("...." + getClass().getName() + "...updating store with new amount" + newAmoutOfItems + "...");
	}
	
	public String getStoreName() {
		System.out.println("Getting store name:");
		return "Store123";
	}
}
