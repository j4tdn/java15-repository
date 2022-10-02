package view;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.*;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Store;
import model.DataModel;

public class Ex08Allocation {
	public static void main(String[] args) {
		// 1. Get all stores which have stock previous day greater than 15
		
		
		
		System.out.println("============exercise 1===============");
		List<Store> stores = DataModel.getStores();
		List<Store> storesStockPreviousDay = stores.stream()
				.filter(store -> store.getStockPreviousDay().compareTo(bd(15))>0)
				.collect(Collectors.toList());
		storesStockPreviousDay.forEach(System.out::println);
		
		
		
		// 2. Get all stores which have stock previous day greater than expected sales today
		// and sort them store id descending
		
		
		
		System.out.println("============exercise 2===============");
		List<Store> storesBiggerSales =
				stores.stream()
				.filter(store -> store.getNotNullStockPreviousDay().compareTo(store.getNotNullExpectedSales())>0)
				.collect(Collectors.toList());
		   storesBiggerSales.forEach(System.out::println);
		   
		   
		   
		   
		// 3. Get stores have no reference store and return list of store 
		   
		   
		   
		System.out.println("============exercise 3===============");
		       List<Long> storesNoReference = stores.stream()
		    		   .filter(store -> store.getReferenceStoreId() != null)
		    		   .map(store -> store.getStoreId())
		    		   .collect(Collectors.toList());
		       storesNoReference.forEach(System.out::println);
		       
		       
		       
		// 4. Distinct stores by stock previous day
		       
		       
		       
		       System.out.println("============exercise 4===============");
		       stores.stream()
		       .map(Store::getStockPreviousDay)
		       .distinct()
		       .forEach(System.out::println);
		
		// 5. Get first 2 stores with max expected sales 
		       
		       
		       
		       System.out.println("============exercise 5===============");
		    List<Store> storeMaxExpectedSales = stores.stream()
		    		.filter(store -> store.getExpectedSales() != null)
		    		.sorted(comparing(store -> store.getExpectedSales(),Comparator.reverseOrder()))
		    		.limit(2)
		    		.collect(Collectors.toList()); 
		    storeMaxExpectedSales.forEach(System.out::println); 
		    
		    
		// 6. Get list of reference stores
		    
		    
		    System.out.println("============exercise 6===============");   
		     stores.stream()
		     .filter(store -> store.getExpectedSales() == null )
		     .forEach(System.out::println);
		     
		     
		     
		 // 7. Is there any store has no expected sales
		     
		     
		     boolean isvalid =   stores.stream()
		    		 .anyMatch(store-> store.getExpectedSales() == null);
		     System.out.println("isvalid : " +isvalid);
		        
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
		 *     
		 */ System.out.println("=========== exersise 8============");
		       List<BigDecimal> storeNoExpectedSales=  stores.stream().filter(store-> store.getExpectedSales() == null)
		    		   .map((Store store)->{
		    			   long count = stores.stream().filter(s-> s.getExpectedSales() != null).count();
		
			    		   BigDecimal sum  = stores.stream().map(Store::getNotNullExpectedSales).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
			    		   BigDecimal medium = sum.divide(bd(count));
		    	   if(store.getReferenceStoreId() != null) {
		    		   
		   
		    		   for(Store storeInput : stores) {
		    			 
		    			   if(store.getReferenceStoreId() == storeInput.getStoreId() && storeInput.getExpectedSales() != null) {
		    				   store.setExpectedSalesInterpolated(storeInput.getExpectedSales());
		    		
		    			   }
		    			   if(store.getReferenceStoreId() == storeInput.getStoreId() && storeInput.getExpectedSales() == null) {
		    				   store.setExpectedSalesInterpolated(medium);
		    			   }
		    			   
		    		   }
		    	   }
		    	   else {
		    		   
		    		   store.setExpectedSalesInterpolated(medium);
		    	   }
		    	   return store.getExpectedSalesInterpolated();
		       })
		    		   .collect(Collectors.toList());
	   storeNoExpectedSales.forEach(System.out::println);
	   
		// 9. Calculate sum of expected sales today
	   System.out.println("============exercise===============");
		    BigDecimal result = stores.stream().map(Store::getNotNullExpectedSales).reduce(BigDecimal.ZERO,(a,b)->a.add(b));
		    System.out.println("result : " + result );
		   		 //10. Find store which has max stock previous day
		// if many stores have same stock previous day, use the one with smallest store id
	   System.out.println("============exercise===============");
	  Optional<Store>opt = stores.stream()
	   .sorted(comparing(Store::getNotNullStockPreviousDay,reverseOrder()).thenComparing(Store::getStoreId))
	   .findFirst();
	  if(opt.isPresent()) {
		  System.out.println("--> store with max stock previous day" + opt.get());
		  
	  }
	}

	private static <T, R> Predicate<T> distinctBy(Function<T, R> function) {
		Set<R> storage = new HashSet<R>();
		return t -> storage.add(function.apply(t));
	}

	public static BigDecimal bd(long value) {
		return BigDecimal.valueOf(value);
	}

}
