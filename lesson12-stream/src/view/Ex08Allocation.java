package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		BigDecimal value = BigDecimal.valueOf(Double.MIN_VALUE);
		List<Store> stores = DataModel.getStores();
		// 1. Get all stores which have stock previous day greater than 15
		  stores.stream().filter(store -> store.getStockPreviousDay().compareTo(DataModel.bd(15)) > 0)
				         .map(Store::getStockPreviousDay).collect(Collectors.toList())
				         .forEach(System.out::println);;
				         System.out.println("==============================");
		// 2. Get all stores which have stock previous day greater than expected sales today
		//and sort them store id descending
	   stores.stream().filter(store -> store.getNonNullStockPreviousDay().compareTo(store.getNonNullExpectedSales()) > 0)
		                   .sorted(Comparator.comparing(Store::getStoreId , Comparator.reverseOrder()))		                   
		                   .collect(Collectors.toList()).forEach(System.out::println);;
		            System.out.println("====================================");
		// 3. Get stores have no reference store and return list of store ids
		stores.stream().filter(store -> store.getReferenceStoreId()==null)
		                .map(Store::getStoreId)
		               .collect(Collectors.toList())
		               .forEach(System.out::println);
		            System.out.println("====================================");
		// 4. Distinct stores by stock previous day
		    stores.stream().map(Store::getStockPreviousDay) // Stream<BigDecimal>
		                   .distinct() // hashcode , equals
		                   .forEach(System.out::println);
		    Set<BigDecimal> storage = new HashSet<BigDecimal>();
		    stores.stream()
		           .filter(store -> storage.add(store.getStockPreviousDay()))
		           .forEach(System.out::println);
		    stores.stream()
		           .filter(distinctBy(Store::getStockPreviousDay))
		           .forEach(System.out::println);
		    System.out.println("============================================");
		// 5. Get first 2 stores with max expected sales 
		    stores.stream()
		                   .sorted(Comparator.comparing(Store::getNonNullExpectedSales , Comparator.reverseOrder()))		                   
		                   .limit(2)
		                   .forEach(System.out::println);
		    System.out.println("=============================================");
		// 6. Get list of reference stores
	   stores.stream()		      
		     .map(Store::getNonNullReferenceStoreId)
		     .forEach(System.out::println);
		// 7. Is there any store has no expected sales
		 boolean checkk =stores.stream().anyMatch(store -> store.getExpectedSales() == null);
		  System.out.println(checkk);
		 /* 
		 * 8. Calculate and return list of store's expected sales which has no expected sales
		 * - store has not expected sales but
		 *   + has reference store which maintained expected sales 
		 *     --> use expected sales of reference store
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 *     
		 *   + has reference store which no maintained expected sales 
		 *     --> use average of store's expected sales with it's own(reference store not count)
		 */
		  
		   List<BigDecimal> sortedListExpectedSales = stores.stream()
				                                             .filter(v -> v.getExpectedSales()!=null)
		                                                     .map(Store::getExpectedSales)
		                                                     .collect(Collectors.toList());
		   long countedValues = stores.stream()
				                            .filter(v -> v.getExpectedSales()!=null)
				                            
				                            .count();
		   System.out.println("counted values :" + countedValues);
		   BigDecimal sumValues = BigDecimal.ZERO;
		   for (BigDecimal obj : sortedListExpectedSales) {
			sumValues = sumValues.add(obj);
		}
		   BigDecimal averageValues = sumValues.divide(BigDecimal.valueOf(countedValues), RoundingMode.HALF_DOWN);
		    System.out.println("Average Value" + averageValues);
		 
		   for (Store store : stores) {
			if (store.getExpectedSales() == null) {
				for (int i = 0; i < sortedListExpectedSales.size(); i++) {
					if ( stores.get(i).getStoreId() == store.getReferenceStoreId() && !(stores.get(i).getExpectedSales().equals(store.getExpectedSales()))) {
					  store.setExpectedSales(sortedListExpectedSales.get(i));
					} else {
						store.setExpectedSales(averageValues);
					}
				}
			}
		} 
		  stores.stream().map(Store::getExpectedSales).forEach(System.out::println);
		  System.out.println("8.=====================================================================");
		// 9. Calculate sum of expected sales today
		 System.out.println(stores.stream().map(Store::getNonNullExpectedSales).reduce((a,b) -> a.add(b)));
		  Optional<BigDecimal> sum =  stores.stream().map(Store::getNonNullExpectedSales).reduce((a,b) -> a.add(b));
		         System.out.println(sum);
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
		Optional<Store> opt =        stores.stream().sorted(Comparator.comparing(Store::getNonNullStockPreviousDay,Comparator.reverseOrder()).thenComparing(Store::getStoreId))
		                        .findFirst();
	    if (opt.isPresent()) {
			System.out.println(opt.get());
		}
	}
	//public static <T,R> Predicate<T> distinctBy(Function<T, R> function){
	//	Set<R> set = new HashSet<>();
	//	return t -> set.add(function.apply(t));
	//}
	private static Predicate<Store> distinctBy(Function<Store, BigDecimal> function){
		Set<BigDecimal> storage = new HashSet<BigDecimal>();
		return store -> storage.add(function.apply(store));
	}
	// closure
	
}