package view;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
		System.out.println(prob1(stores));
		// 2. Get all stores which have stock previous day greater than expected sales
		// today
		// and sort them store id descending

		// 3. Get stores have no reference store and return list of store ids

		// 4. Distinct stores by stock previous day

		// 5. Get first 2 stores with max expected sales

		// 6. Get list of reference stores

		// 7. Is there any store has no expected sales

		/*
		 * 8. Calculate and return list of store's expected sales which has no expected
		 * sales - store has not expected sales but + has reference store which
		 * maintained expected sales --> use expected sales of reference store + has
		 * reference store which no maintained expected sales --> use average of store's
		 * expected sales with it's own(reference store not count)
		 * 
		 * + has reference store which no maintained expected sales --> use average of
		 * store's expected sales with it's own(reference store not count)
		 */

		// 9. Calculate sum of expected sales today

		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store
		// id
	}

	private static List<Store> prob1(List<Store> source) {
		return source.stream()
				.filter(s -> s.getStockPreviousDay().compareTo(DataModel.bd(15)) > 0)
				.collect(Collectors.toList());
	}
	private static List<Store> prob2(List<Store> source) {
		return source.stream()
				.filter(s -> s.getNonNullStockPreviousDay().compareTo(s.getNonNullExpectedSales()) > 0)
				.sorted(Comparator.comparing(Store::getStoreId,Comparator.reverseOrder()))
				.collect(Collectors.toList());
	}
	private static List<Long> prob3(List<Store> source) {
		return source.stream()
				.filter(s -> s.getReferenceStoreId() == null)
				.map(Store::getStoreId)
				.collect(Collectors.toList());
	}
	private static List<Store> prob4(List<Store> source) {
		return source.stream()
				.filter(distinctByKey(Store::getStockPreviousDay))
				.collect(Collectors.toList());
//		Map<> source.stream()
//					 .collect(Collectors.toMap(Store::getStockPreviousDay, Function.identity(), (e1,e2) -> e1)));
	}
	private static List<Store> prob5(List<Store> source) {
		return source.stream()
				.filter(store -> store.getExpectedSales() != null)
				.sorted(Comparator.comparing(Store::getNonNullExpectedSales,Comparator.reverseOrder()))
				.limit(2)
				.collect(Collectors.toList());
	}
	private static List<Store> prob6(List<Store> source) {
		List<Long> refStore = source.stream()
				.filter(s -> s.getReferenceStoreId() != null)
				.map(Store::getReferenceStoreId)
				.collect(Collectors.toList());
		return source.stream()
				     .filter(store -> refStore.contains(store.getStoreId()))
				     .collect(Collectors.toList());
	}
	private static boolean prob7(List<Store> source) {
		return source.stream()
					 .allMatch(store -> store.getExpectedSales() != null);
	}
	
	private static List<BigDecimal> prob8(List<Store> source) {
		List<Store> temp = source;
		temp.stream()
			.filter(s -> s.getReferenceStoreId() == null)
			.forEach(s -> setValueNullRefStore(s, source));
												
		return temp.stream()
					.map(Store::getExpectedSales)
					.collect(Collectors.toList());
	}
	private static Store findStoreByStoreId(Long storeId, List<Store> stores)
	{
		for(Store store : stores)
		{
			if(storeId.equals(store.getStockPreviousDay()))
			{
				return store;
			}
		}
		return null;		
	}
	public static BigDecimal calAverage(List<Store> stores) {
		Long count=stores.stream()
				  .filter(store -> store.getExpectedSales() != null)
				  .count();
		BigDecimal result = stores.stream()
								  .filter(store -> store.getExpectedSales() != null)
								  .map(Store::getExpectedSales)
								  .reduce((a,b) -> a.add(b)).get();
		return result.divide(DataModel.bd(count));
		
	}
	public static void setValueNullRefStore(Store e, List<Store> stores)
	{
		if(e.getExpectedSales() == null)
		{
			Store temp = findStoreByStoreId(e.getStoreId(), stores);
			if(temp.getExpectedSales() != null)
			{
				e.setExpectedSales(temp.getExpectedSales());
			}
			else
			{
				e.setExpectedSales(calAverage(stores));
			}
		}
	}
	private static BigDecimal prob9(List<Store> source) {
		return source.stream()
					 .map(Store::getNonNullExpectedSales)
					 .reduce((a,b) -> a.add(b))
					 .get();
	}
	private static Store prob10(List<Store> source) {
		Optional<Store> opt =  source.stream()
					 .sorted(Comparator.comparing(Store::getStockPreviousDay,Comparator.reverseOrder())
							 .thenComparing(Store::getStoreId))
					 .findFirst();
		return (opt.isPresent() == true) ? opt.get() : null;
	}
	
	
	public static <T,R> Predicate<T> distinctByKey(Function<T, R> function) {
		Set<R> seen = new HashSet<>();
		return t -> seen.add(function.apply(t));
	}
}

//package view;
//
//import java.math.BigDecimal;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import bean.Store;
//import model.DataModel;
//
//public class Ex08Allocation {
//	public static void main(String[] args) {
//		// 1. Get all stores which have stock previous day greater than 15
//		List<Store> stores = DataModel.getStores();
//		
////		List<Store> storesByStock = stores.stream()
////				.filter(store -> store.getStockPreviousDay().compareTo(bd(15L)) > 0)
////				.collect(Collectors.toList());
////		storesByStock.forEach(System.out::println);
//		System.out.println("===========2==========");
//		// 2. Get all stores which have stock previous day greater than expected sales today
//		// and sort them store id descending
//		stores.stream()
//				.filter(s -> s.getNonNullStockPreviousDay().compareTo(s.getNonNullExpectedSales()) > 0)
//				.map(a -> a.getStoreId())
//				.collect(Collectors.toSet())
//				.forEach(System.out::println);
//		System.out.println("==========3===========");
//		// 3. Get stores have no reference store and return list of store ids
//		stores.stream()
//					.filter(s -> s.getReferenceStoreId() == null)
//					.map(s -> s.getStoreId())
//					.collect(Collectors.toList())
//					.forEach(System.out::println);
//		System.out.println("=========4============");
//		// 4. Distinct stores by stock previous day
//		stores.stream()
//						.map(Store::getStockPreviousDay)
//						.distinct()
//						.collect(Collectors.toList())
//						.forEach(System.out::println);
//		
//		System.out.println("=========5============");
//		// 5. Get first 2 stores with max expected sales
//		//Set<Store> a = new TreeSet<>();
//				stores.stream()
//					
//					  .filter(s -> s.getExpectedSales() != null)
//					  .sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder()))
//					  .limit(2)
//					  .collect(Collectors.toList())
//					  .forEach(System.out::println);
//		
//		// 6. Get list of reference stores
//		
//		// 7. Is there any store has no expected sales
//		
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
//				System.out.println("------9------");
//		BigDecimal n = stores.stream()
//							  .map(Store::getNonNullExpectedSales)
//							  .reduce(BigDecimal.ZERO, (a,b) -> a.add(b));
//						System.out.println(n);
//		// 10. Find store which has max stock previous day
//		// if many stores have same stock previous day, use the one with smallest store id
//	}
////	private static BigDecimal bd(long value) {
////        return BigDecimal.valueOf(value);
////    }
//	
//	
//
//	
//}