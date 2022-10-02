package view;

import bean.Store;
import model.DataModel;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityManager.Limit;

public class Ex08Allocation {
	public static void main(String[] args) {
		// 1. Get all stores which have stock previous day greater than 15
		List<Store> stores = DataModel.getStores();
		
		List<Store> getStore = stores.stream()
		.filter(s-> s.getStockPreviousDay().compareTo(bd(15))>0)
		.collect(Collectors.toList());
		getStore.forEach(System.out::println);
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
//		List<Store> store = stores.stream()
//			.filter(a->a.getStockPreviousDay().compareTo(a.getClass())>0)
//			.sorted(Comparator.comparing(Store:: getStoreId).reversed());
//			store.forEach(System.out:: println);
			
		// 3. Get stores have no reference store and return list of store ids
//			List<Store> idstore = stores.stream()
//			.filter(b->b.getStoreId()== null)
//			.map(Store :: getStoreId)
//			.collect(Collectors.toList());
//			idstore.forEach(System.out:: println);
		// 4. Distinct stores by stock previous day
			 stores.stream()
			 .map(Store:: getStockPreviousDay)
			 .distinct()
			 .forEach(System.out::println);
		// 5. Get first 2 stores with max expected sales 
			 stores.stream()
			 .filter(store->store.getExpectedSales()!= null)
			 .sorted(Comparator.comparing(Store :: getExpectedSales).reversed())
			 .limit(2)
			 .forEach(System.out::println);
		// 6. Get list of reference stores
		
			 
			 stores.stream()
			 .map(Store:: getReferenceStoreId)
			 .filter(r->r != null)
			 .forEach(System.out::println);
		// 7. Is there any store has no expected sales
		
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
		
		// 10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
	}
	private static BigDecimal bd(long value) {
        return BigDecimal.valueOf(value);
    }
	private static <T,R> Predicate<T> distinctBy(Function<T,R>function){
		Set<R> stogre = new HashSet<>;
		return t ->stogre.add(function.apply(t))
	}
	
}