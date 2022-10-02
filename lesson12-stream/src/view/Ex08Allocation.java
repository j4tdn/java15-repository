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
		// 1. Get all stores which have stock previous day greater than 15

		List<Store> storeByStockcdn = stores.stream().filter(s -> s.getStockPreviousDay().compareTo(bd(15)) > 0)
				.collect(Collectors.toList());
		storeByStockcdn.forEach(System.out::println);
		// 2. Get all stores which have stock previous day greater than expected sales
		// today
		// and sort them store id descending
		System.out.println("====================");
		System.out.println(" 2. Get all stores which have stock previous day greater than expected"
				+ " sales today and sort them store id descending ");
		List<Store> ex02 = stores.stream()
				.filter(store -> store.getStockPreviousDay() != null && store.getExpectedSales() != null)
				// .filter(store -> store.getNonNullStockPreviousDay().compareTo
//						(store.getNonNullExpectedSales()) > 0)
				.sorted(Comparator.comparing(Store::getStoreId).reversed()).collect(Collectors.toList());
		ex02.forEach(System.out::println);
		// 3. Get stores have no reference store and return list of store ids
		System.out.println("====================");
		List<Store> Ex03 = stores.stream().filter(s -> s.getReferenceStoreId() == null && s.getSelected() == true)
				.collect(Collectors.toList());
		Ex03.forEach(System.out::println);
		// 4. Distinct stores by stock previous day
		System.out.println("====================");
		stores.stream().map(Store::getStockPreviousDay).distinct().forEach(System.out::println);
		// 5. Get first 2 stores with max expected sales
		stores.stream().filter(s -> s.getExpectedSales() != null)
				.sorted(Comparator.comparing(Store::getExpectedSales, Comparator.reverseOrder())).limit(2)
				.forEach(System.out::println);
		// 6. Get list of reference stores
		System.out.println("====================");
		stores.stream().filter(Objects::nonNull).map(Store::getReferenceStoreId).forEach(System.out::println);
		// 7. Is there any store has no expected sales
		System.out.println("====================");
		boolean Ex07 = stores.stream().anyMatch(s -> s.getExpectedSales() == null);
		System.out.println("Is there any store has no expected sales:  " + Ex07);
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
		
//		List<BigDecimal> expect = stores.stream()
//				.map(s -> s.getExpectedSales() != null)
//				.collect(Collectors.toList());
//		BigDecimal avg = avg(expect);
//		
//		List<BigDecimal> controllingExpectedSales = stores.stream()
//				.map(Store::getExpectedSales)
//				.collect(Collectors.toList());
//		
//		for(Store store: stores) {
//			if(store.getExpectedSales() == null) {
//				for(int i = 0; i < controllingExpectedSales.size(); i++) {
//					if(stores.get(i).getStoreId().equals(store.getReferenceStoreId())
//								&& stores.get(i).getExpectedSales() != null ) {
//						store.setExpectedSales(controllingExpectedSales.get(i));
//					}else
//						store.setExpectedSales(avg);
//					}
//				}
//		}
		stores.forEach(System.out::println);
		// 9. Calculate sum of expected sales today
		Long sum = stores.stream().filter(s -> s.getExpectedSales() != null).map(s -> s.getExpectedSales().longValue())
				.reduce((a, b) -> a + b).get();
		System.out.println("Calculate sum of expected sales today: " + sum);
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store
		// id
		Optional<Store> optStore = stores.stream()
				.sorted(Comparator.comparing(Store::getNonNullStockPreviousDay, Comparator.reverseOrder())
						.thenComparing(Store::getStoreId))
				.findFirst();

		if (optStore.isPresent()) {
			System.out.println("--> store with max stock previous day " + optStore.get());
		}
	}

	public static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> storage = new HashSet<>();
		return t -> storage.add(function.apply(t));
	}

	public static BigDecimal avg(List<BigDecimal> list) {
		BigDecimal avg = bd(0);
		for (BigDecimal element : list) {
			avg = avg.add(element);
		}

		BigDecimal bdList = BigDecimal.valueOf(list.size());
		return avg.divide(bdList, 2, RoundingMode.HALF_UP);
	}

	public static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

}