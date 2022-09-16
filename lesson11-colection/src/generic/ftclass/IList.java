package generic.ftclass;

import java.util.function.Predicate;

public interface IList<E> {
	int size();
	boolean add(E e);
	boolean add (int index, E e);
	boolean addIf(E e, Predicate<E> predicate);
	boolean remove(int index);
	boolean remove(E e);
	boolean removeIf(Predicate<E> predicate);
	E grt(int index);
	void set (int index);
	void 
}
