package view;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		// 1. Get all stores which have stock previous day greater than 15
		List<Store> stores = DataModel.getStores();
		
		System.out.println("1. Get all stores which have stock previous day greater than 15");
		
		stores.stream()
			.filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0)
			//.collect(Collectors.toList())
			.forEach(System.out::println);
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
		System.out.println("2. Get all stores which have stock previous day greater than expected sales today "
				+ "and sort them store id descending");
		stores.stream()
			  //.filter(store -> store.getExpectedSales() != null && store.getStockPreviousDay() != null)
			  .filter(store -> store.getNonNullStockPreviousDay().compareTo(store.getNonNullExpectedSales()) > 0)
			  .sorted(Comparator.comparing(Store::getStoreId, Comparator.reverseOrder()))
			//.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		
		// 3. Get stores have no reference store and return list of store ids
		System.out.println("3. Get stores have no reference store and return list of store ids ");
		stores.stream()
				.filter(store -> store.getReferenceStoreId() == null)
				.map(Store::getStoreId)
				.collect(Collectors.toSet())
				.forEach(System.out::println);
		
		
		// 4. Distinct stores by stock previous day
		System.out.println("4. Distinct stores by stock previous day");
		stores.stream()
				.map(Store::getStockPreviousDay)
				.distinct()
				.forEach(System.out::println);
		
		
		// 5. Get first 2 stores with max expected sales 
		System.out.println("5. Get first 2 stores with max expected sales ");
		stores.stream()
				.filter(store -> store.getExpectedSales() != null)
				.sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder()))
				.limit(2)
				.forEach(System.out::println);
		
		// 6. Get list of reference stores
		System.out.println("6. Get list of reference stores");
		stores.stream()
				.filter(store -> store.getReferenceStoreId() != null)
				.map(Store::getReferenceStoreId)
				.forEach(System.out::println);
		
		// 7. Is there any store has no expected sales
		System.out.println("Question 7");
		//c1
		long count = stores.stream()
				.filter(store -> store.getExpectedSales() == null)
				.count();
		System.out.println("Is there any store has no expected sales? ==> " + (count > 0));
		
		//c2
		boolean isValid = stores.stream()
				.anyMatch(store -> store.getExpectedSales() == null);
		System.out.println("is Valid ==> " + isValid);
		
		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		
		
		// 9. Calculate sum of expected sales today
		System.out.println("9. Calculate sum of expected sales today");
		BigDecimal sumOfExpectedSales = stores.stream()
												.map(Store::getNonNullExpectedSales)
												.reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
		System.out.println("sumOfExpectedSales: " + sumOfExpectedSales);
												
		
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
		System.out.println("Question 10");
		Optional<Store> opt = stores.stream()
				.sorted(Comparator.comparing(Store::getNonNullStockPreviousDay, Comparator.reverseOrder())
						.thenComparing(Store::getStoreId))
				.findFirst();
		if(opt.isPresent()) {
			System.out.println("--> store with max stock previous day: \n" + opt.get());
		}
	}
	
	//closure
	private static <T,R> Predicate<T> distinctBy (Function<T, R> function){
		Set<R> storage = new HashSet();
		return t -> storage.add(function.apply(t));
	}
	
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }
}
