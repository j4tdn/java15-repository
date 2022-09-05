package generic.ftclass;

import java.util.function.Consumer;
import java.util.function.Predicate;


public interface IList<E>{

	int size();
	boolean add(E e);
	boolean add(int index, E e);
	boolean addIf(E e, Predicate<E> predicate);
	boolean remove(E e);
	boolean remove(int index);
	boolean remove(Predicate<E> predicate);
	E get(int index);
	void set(int index, E value);
	void interate(Consumer<E> consumer);
	
	
	
	
	
}
