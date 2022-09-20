package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.HashSet;
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
//		System.out.println("1. Get all stores which have stock previous day greater than 15 "); 
//		List<Store> ex01 = stores.stream()
//				.filter(store -> store.getStockPreviousDay().compareTo(bd(15)) > 0)
//				.collect(Collectors.toList());
//		ex01.forEach(System.out::println);
		
		System.out.println(" 2. Get all stores which have stock previous day greater than expected"
				+ " sales today and sort them store id descending ");
		List<Store> ex02 = stores.stream()
				// .filter(store -> store.getStockPreviousDay() != null && store.getExpectedSales() != null) chua duoc
				.filter(store -> store.getNonNullStockPreviousDay().compareTo
						(store.getNonNullExpectedSales()) > 0)
				.sorted(Comparator.comparing(Store::getStoreId).reversed())
				.collect(Collectors.toList());
		ex02.forEach(System.out::println);
		
		System.out.println(" 3. Get stores have no reference store and return list of store ids ");
		List<Long> ex03 = stores.stream()
				.filter(store -> store.getReferenceStoreId() == null)
				.map(Store::getStoreId)
				.collect(Collectors.toList());
		System.out.println(ex03);
		
		System.out.println("4. Distinct stores by stock previous day ");
//		Set<BigDecimal> storage = new HashSet<>();
		List<Store> ex04 = stores.stream()
//				.map(Store::getStockPreviousDay)
//				.distinct()
//				.collect(Collectors.toList()); c1
				
//				.filter(store -> storage.add(store.getStockPreviousDay()))
//				.collect(Collectors.toList()); c2
				
				.filter(distinctBy(store -> store.getStockPreviousDay())) 
				.collect(Collectors.toList());// c3
		ex04.forEach(System.out::println);  
		
		System.out.println(" 5. Get first 2 stores with max expected sales ");
		List<Store> ex05 = stores.stream()
//				.filter(store -> store.getExpectedSales() != null) 
//				.sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder())) c1
				
				.sorted(Comparator.comparing(Store::getNonNullExpectedSales, Comparator.reverseOrder()))//c2
				.limit(2)
				.collect(Collectors.toList());
		ex05.forEach(System.out::println);
		System.out.println(" 6. Get list of reference stores ");
		List<Long> ex06 = stores.stream()
				.map(Store::getReferenceStoreId)
//				.filter(store -> store.getReferenceStoreId() != null) c1
				
				.filter(refStore -> Objects.nonNull(refStore)) // c2
				.filter(Objects::nonNull) // method reference
				.collect(Collectors.toList());
		System.out.println(ex06);
//		
		System.out.println(" 7. Is there any store has no expected sales ");
		boolean ex07 = stores.stream()
				.anyMatch(store -> store.getExpectedSales() == null);
		System.out.println(ex07);

		/* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		System.out.println(" 8.");
		
		List<BigDecimal> expect = stores.stream()
				.map(Store::getNonNullExpectedSales)
				.collect(Collectors.toList());
		BigDecimal avg = avg(expect);
		
		List<BigDecimal> controllingExpectedSales = stores.stream()
				.map(Store::getExpectedSales)
				.collect(Collectors.toList());
		
		for(Store store: stores) {
			if(store.getExpectedSales() == null) {
				for(int i = 0; i < controllingExpectedSales.size(); i++) {
					if(stores.get(i).getStoreId().equals(store.getReferenceStoreId())
								&& stores.get(i).getExpectedSales() != null ) {
						store.setExpectedSales(controllingExpectedSales.get(i));
					}else
						store.setExpectedSales(avg);
					}
				}
		}
		stores.forEach(System.out::println);
		
		System.out.println(" 9. Calculate sum of expected sales today ");
		Optional<BigDecimal> sumExpectedSales = stores.stream()
				.map(Store::getNonNullExpectedSales)
				.reduce((a,b) -> a.add(b));
		System.out.println(sumExpectedSales);
		
		System.out.println(" 10. Find store which has max stock previous day  if many stores have"
				+ " same stock previous day, use the one with smallest store id");
		Optional<Store> optStore = stores.stream()
				.sorted(Comparator.comparing(Store::getNonNullStockPreviousDay, Comparator.reverseOrder())
				.thenComparing(Store::getStoreId))
				.findFirst();
		

		if(optStore.isPresent()) {
			System.out.println("--> store with max stock previous day " + optStore.get());
		}
	}
	
	public static BigDecimal bd(long value) {
	    return BigDecimal.valueOf(value);
	}
	
	// closure
	
	public static BigDecimal avg(List<BigDecimal> list) {
		BigDecimal avg = bd(0);
		for(BigDecimal element : list) {
			avg = avg.add(element);
		}
		
		BigDecimal bdList = BigDecimal.valueOf(list.size());
		return avg.divide(bdList,2 , RoundingMode.HALF_UP);
	}
	
	public static <T, R> Predicate<T> distinctBy(Function<T, R> function){
		Set<R> storage = new HashSet<>();
		return t -> storage.add(function.apply(t));
	}
//	public static <T, R> Predicate<T> distinctBy(Function<T, R> function){
//			Set<R> storage = new HashSet<>();
//			return t -> storage.add(function.apply(t));
//	}
}