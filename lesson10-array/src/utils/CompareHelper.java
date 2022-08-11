package utils;

@FunctionalInterface
public interface CompareHelper {
	boolean compare(int pre, int next);
	
	// functional interface
	// Instead of new Interface and override abstract method to create a interface instance
	
	// Using lambda expression to create an instance of functional interface
}
