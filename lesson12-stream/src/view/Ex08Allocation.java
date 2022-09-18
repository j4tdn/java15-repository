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

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		List<Store> stores = DataModel.getStores();
		// 1. Get all stores which have stock previous day greater than 15
		List<Store> ex01 = stores.stream()
				.filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0)
				.collect(Collectors.toList());
		ex01.forEach(System.out::println);
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
//		List<Store> ex02 = stores.stream()
//				.filter(store -> store.getNonNullStockPreviousDay().
//						compareTo(store.getNonNullExpectedSales() > 0)
//				.collect(Collectors.toList());
//		ex02.forEach(System.out::println);
		// 3. Get stores have no reference store and return list of store ids
		List<Long> ex03 = stores.stream()
				.filter(store -> store.getReferenceStoreId() == null)
				.map(Store::getStoreId)
				.collect(Collectors.toList());
		ex03.forEach(System.out::println);
//		}
//		// 4. Distinct stores by stock previous day
		System.out.println("4. Distinct stores by stock previous day");
		List<BigDecimal> ex04 = stores.stream()
				.map(Store::getStockPreviousDay)
				.distinct()
				.collect(Collectors.toList());
		ex04.forEach(System.out::println);
//		// 5. Get first 2 stores with max expected sales 
//		Optional<BigDecimal> max = stores.stream()
//				.filter(distinctBy(store -> store.get
//		System.out.println(max);
		// 6. Get list of reference stores
		List<Store> ex06 = stores.stream()
				.filter(store -> store.getReferenceStoreId() != null)
				.collect(Collectors.toList());
		ex06.forEach(System.out::println);
//		
//		// 7. Is there any store has no expected sales
		boolean ex07 = stores.stream()
				.anyMatch(store -> store.getExpectedSales() == null);
		System.out.println(ex07);

//		/* 
//		 * 8. Calculate and return list of store's expected sales which has no expected sales
//		 * - store has not expected sales but
//		 *   + has reference store which maintained expected sales 
//		 *     --> use expected sales of reference store
//		 *   + has reference store which no maintained expected sales 
//		 *     --> use average of store's expected sales with it's own(reference store not count)
//		 *     
//		 *   + has reference store which no maintained expected sales 
//		 *     --> use average of store's expected sales with it's own(reference store not count)
//		 */
//		
//		// 9. Calculate sum of expected sales today
		Optional<BigDecimal> sumExpectedSales = stores.stream()
				.map(Store::getNonNullExpectedSales)
				.reduce((a,b) -> a.add(b));
		System.out.println(sumExpectedSales);
//		// 10. Find store which has max stock previous day
//		// if many stores have same stock previous day, use the one with smallest store id
		Optional<BigDecimal> max = stores.stream()
				.map(Store::getNonNullStockPreviousDay)
				.distinct()
				.reduce(BigDecimal::max);
		System.out.println(max);
//	}
	}
	public static BigDecimal bd(long value) {
	    return BigDecimal.valueOf(value);
	}
	
	// closure
	public static<T, R> Predicate<T> distinct(Function<T, R> function){
			Set<R> storage = new HashSet<>();
			return t -> storage.add(function.apply(t));
	}
}