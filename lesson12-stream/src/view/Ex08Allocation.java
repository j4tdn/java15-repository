package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSOutput;

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		List<Store> stores = DataModel.getStores();
		// 1. Get all stores which have stock previous day greater than 15
		stores.stream().filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0).collect(Collectors.toList())
		.forEach(System.out::println);
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
		System.out.println("=======================================");
		stores.stream()
		.filter(store -> store.getStockPreviousDay().compareTo(store.getNonNullExpectedSales() ) > 0)
		.sorted(Comparator.comparing(Store::getStoreId).reversed())
		.forEach(System.out::println);
		
		// 3. Get stores have no reference store and return list of store id
		System.out.println("========================================");
		stores.stream()
				 .filter(store-> store.getReferenceStoreId() == null )
				 .map(Store::getStoreId)
				 .collect(Collectors.toList())
				 .forEach(System.out::println);
		
		// 4. Distinct stores by stock previous day
		System.out.println("========================================");
		stores.stream()
		 .map(Store::getStockPreviousDay)
		 .distinct()
		 .collect(Collectors.toList())
		 .forEach(System.out::println);
		
		
		// 5. Get first 2 stores with max expected sales 
		System.out.println("=================5======================");
		stores.stream()
		 .filter(store -> store.getExpectedSales() != null)
		 .sorted(Comparator.comparing(Store::getExpectedSales).reversed())
		 .limit(2)
		 .collect(Collectors.toList())
		 .forEach(System.out::println);

		
		// 6. Get list of reference stores
		System.out.println("=================6======================");
		stores.stream()
		 .filter(store -> store.getReferenceStoreId() != null )
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		// 7. Is there any store has no expected sales
		System.out.println("=================7======================");
		int n = 
		  stores.stream()
		 .filter(store -> store.getExpectedSales() == null )
		 .collect(Collectors.toList())
		 .size();
		
		System.out.println("Is there any store has no expected sales ---> " + (n>0));
		
		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 * 
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 */
		System.out.println("=================8======================");
								
		
		// 9. Calculate sum of expected sales today
		System.out.println("========================9=====================");
		BigDecimal sumOfExpectValue = bd(0);
		for(Store store :stores) {
    		if(store.getExpectedSales() !=null ) {
				sumOfExpectValue= sumOfExpectValue.add(store.getExpectedSales());
			}
    	}
		System.out.println(sumOfExpectValue);
		
		
		stores.stream()
			  .map(Store::getNonNullExpectedSales)
			  .reduce((a,b) -> a.add(a));
		
		// 10. Find store which has max stock previous day
		System.out.println("========================10=====================");
		stores.stream()
		 .filter(store -> store.getStockPreviousDay() != null)
		 .sorted(Comparator.comparing(Store::getStockPreviousDay).reversed().thenComparing(Store::getStoreId))
		 .limit(1)
		 .collect(Collectors.toList())
		 .forEach(System.out::println);
		
		Optional<Store> opt = stores.stream()
									.sorted(Comparator.comparing(Store::getNonNullExpectedSales,Comparator.reverseOrder())
									.thenComparing(Store::getStoreId))
									.findFirst();
		
									
		// if many stores have same stock previous day, use the one with smallest store id
	}
	
//	private static Predicate<Store> disPredicate(Function<Store, BigDecimal> function){
//		
//	}
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }


	
}