package map;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.
public class Ex02ObjectMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static Map<Warehouse, List<Item>> inventory(){
		Map<Warehouse, List<Item>> inventory = new HashMap<>();
		inventory.put(new Warehouse("Wh 1", "Vung Tau"),Array.asList(new Item(1,"A",10,101)));
	}
}
