package view;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;
public class Ex08Allocation {
	public static void main(String[] args) {
List<Store> stores = DataModel.getStores();
		
		// 1. Get all stores which have stock previous day greater than 15
		stores.stream()
			  .filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0)
			  .forEach(System.out::println);
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
		
		System.out.println("----- Question 2 -----");
		stores.stream()
			  .filter(store -> store.getNonNullStockPreviousDay().compareTo(store.getNonNullExpectedSale()) > 0)
			  .sorted(Comparator.comparing(Store::getStoreId).reversed())
			  .forEach(System.out::println);
		
		// 3. Get stores have no reference store and return list of store ids
		System.out.println("----- Question 3 -----");
		stores.stream()
			  .filter(store -> store.getReferenceStoreId() == null)
			  .map(Store::getStoreId)
			  .forEach(System.out::println);
		
		// Đạt
		// 4. Distinct stores by stock previous day  1 2 2 3 -- distinct -- 1 2 3
		System.out.println("----- Question 4 -----");
		stores.stream()
			  .map(Store::getStockPreviousDay) // Stream<BigDecimal>
			  .distinct()                      // hashcode, equals
			  .forEach(System.out::println);
		
		stores.stream()
			  .filter(distinctBy(store -> store.getStockPreviousDay()))
			  .forEach(System.out::println);
		
		// 5. Get first 2 stores with max expected sales 
		System.out.println("-- Question 5 --");
		stores.stream()
			  .filter(store -> store.getExpectedSales() != null)
			  .sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder()))
			  .limit(2)
			  .forEach(System.out::println);
		
		// 6. Get list of reference stores
		System.out.println("-- Question 6 -- ");
		stores.stream()
			  .map(Store::getReferenceStoreId)
			  .filter(Objects::nonNull)
			  .forEach(System.out::println);
		
		// 7. Is there any store has no expected sales
		System.out.println("-- Question 7 --");
		long count = stores.stream()
				      .filter(store -> store.getExpectedSales() == null)
				      .count();
		System.out.println("Is there any store has no expected sales --> " + (count > 0));
		
		boolean isValid = stores.stream()
			  .anyMatch(store -> store.getExpectedSales() == null);
		System.out.println("isValid " + isValid);
		
		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 *   + has no reference store
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		
		// flatMap, primitive stream, match, optional
		// IntStream --> boxed --> Stream<Integer>
		
		
		// 9. Calculate sum of expected sales today
		BigDecimal sumOfExpectedSales = stores.stream()
		      .map(Store::getNonNullExpectedSale)
		      .reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
		System.out.println("sumOfExpectedSales " + sumOfExpectedSales);
		
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
		Optional<Store> opt = stores.stream()
			  .sorted(Comparator.comparing(Store::getNonNullStockPreviousDay, Comparator.reverseOrder())
					  		    .thenComparing(Store::getStoreId))
			  .findFirst();
		
		if(opt.isPresent()) {
			System.out.println("--> store with max stock previous day " + opt.get());
		}
		
	}
	
	// closure
	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> storage = new HashSet<>();
		return t -> storage.add(function.apply(t));
	}
	
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    
	}
}