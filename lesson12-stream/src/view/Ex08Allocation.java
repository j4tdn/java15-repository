
package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		List<Store> stores = DataModel.getStores();
		average(stores);
		// 1. Get all stores which have stock previous day greater than 15
		List<Store> store = stores.stream().filter(d -> d.getStockPreviousDay().compareTo(bd(15)) > 0)
				.collect(Collectors.toList());
		store.forEach(System.out::println);
		System.out.println("============");
		// 2. Get all stores which have stock previous day greater than expected sales
		// today
		// and sort them store id descending
		List<Store> store2 = stores.stream().filter(d -> {
			if (d.getExpectedSales() == null) {
				return true;
			}
			return d.getStockPreviousDay().compareTo(d.getExpectedSales()) > 0;
		}).collect(Collectors.toList());
		store2.forEach(System.out::println);
//			
		// 3. Get stores have no reference store and return list of store ids
		List<Long> store3 = stores.stream().filter(d -> (d.getReferenceStoreId() == null)).map(Store::getStoreId)
				.collect(Collectors.toList());
		store3.forEach(System.out::println);

		// 4. Distinct stores by stock previous day
		List<Store> store4 = stores.stream().distinct().collect(Collectors.toList());
		store4.forEach(System.out::println);
		// 5. Get first 2 stores with max expected sales
		System.out.println("=====5====");
		List<Store> store5 = stores.stream().sorted((o1, o2) -> {
			if (o1.getExpectedSales() == null) {
				return 1;
			}
			if (o2.getExpectedSales() == null) {
				return -1;
			}
			return o2.getExpectedSales().compareTo(o1.getExpectedSales());
		}).limit(2).collect(Collectors.toList());
		store5.forEach(System.out::println);

		// 6. Get list of reference stores
		System.out.println("=======6==========");
		List<Long> store6 = stores.stream().filter(d -> d.getReferenceStoreId() != null).map(Store::getReferenceStoreId)
				.collect(Collectors.toList());
		store6.forEach(System.out::println);

		// 7. Is there any store has no expected sales
		System.out.println("=========7=========");
		boolean store7 = stores.stream().anyMatch(d -> d.getExpectedSales() == null);
		System.out.println(store7);
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
		System.out.println("=======8==========");
		List<Long> expectedSalesNoValue = getExpectedSalesNoValue(stores);
		System.out.println(expectedSalesNoValue);
		List<Long> referenceSales = getReferenceStoreValue(stores, expectedSalesNoValue);
		System.out.println(referenceSales);
		List<BigDecimal> expectedSalesValue = getExpectedSalesValue(stores, referenceSales);
		System.out.println("exvalue: " + expectedSalesValue);
		setExpectedSalesValue(stores, expectedSalesValue, expectedSalesNoValue);
		stores.forEach(System.out::println);



		// 9. Calculate sum of expected sales today
		System.out.println("=======9=======");
		Optional<BigDecimal> sum = stores.stream().filter(d -> d.getExpectedSales() != null)
				.map(Store::getExpectedSales).reduce((a, b) -> a.add(b));
		sum.ifPresent(System.out::println);
		// 10. Find store which has max stock previous day
		System.out.println("====10====");
		Optional<Store> store10 = stores.stream().filter(d -> d.getStockPreviousDay() != null)
				// .map(d -> d.getStockPreviousDay())
				.reduce((o1, o2) -> o1.getStockPreviousDay().compareTo(o2.getStockPreviousDay()) > (0) ? o1 : o2);

		store10.ifPresent(System.out::println);

		// if many stores have same stock previous day, use the one with smallest store
		// id
	}

	public static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> storage = new HashSet<>();
		return t -> storage.add(function.apply(t));
	}

	private static List<Long> getExpectedSalesNoValue(List<Store> stores) {
		List<Long> store = stores.stream().filter(d -> d.getExpectedSales() == null).map(Store::getStoreId)
				.collect(Collectors.toList());
		return store;
	}

	private static List<Long> getReferenceStoreValue(List<Store> stores, List<Long> expectedSalesNoValue) {
		List<Long> referenceStoreValue = new ArrayList<>();
		for (Store store : stores) {
			for (int i = 0; i < expectedSalesNoValue.size(); i++) {
				if (store.getStoreId() == expectedSalesNoValue.get(i)) {
					if (store.getReferenceStoreId() != null) {
						referenceStoreValue.add(store.getReferenceStoreId());
					} else {
						store.setExpectedSales(average(stores));
						break;
					}
				}
			}
		}
		return referenceStoreValue;

	}

	private static List<BigDecimal> getExpectedSalesValue(List<Store> stores, List<Long> referenceSales) {
		List<BigDecimal> expectedSalesValue = new LinkedList<>();
		for (Store store : stores) {
			for (int i = 0; i < referenceSales.size(); i++) {
				if (store.getStoreId() == referenceSales.get(i)) {
					if (store.getExpectedSales() != null) {
						expectedSalesValue.add(store.getExpectedSales());
					} else {
						expectedSalesValue.add(average(stores));
					}

				}
			}
		}
		return expectedSalesValue;

	}

	private static void setExpectedSalesValue(List<Store> stores, List<BigDecimal> expectedSalesValue,
			List<Long> expectedSalesNoValue) {
		int count = 0;
		// List<BigDecimal> expectedSalesValue = new LinkedList<>();
		for (Store store : stores) {
			if (store.getExpectedSales() == null) {
					store.setExpectedSales(expectedSalesValue.get(count++));
			}
		}
	}

	private static BigDecimal average(List<Store> stores) {
		BigDecimal sum = new BigDecimal(0);
		for (Store store : stores) {
			if (store.getExpectedSales() != null) {
				sum = sum.add(store.getExpectedSales());
			}
		}
		return sum.divide(bd(stores.size()));

	}

}
