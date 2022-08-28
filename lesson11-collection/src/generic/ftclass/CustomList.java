package generic.ftclass;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E>{
	
	private static int defaultCapacity = 4;
	private int size;
	private E[] elements;
	
	public CustomList() {
		this(defaultCapacity);
	}
	
	public CustomList(int capacity) {
		if(capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be > 0");
		}
		elements = createArrayInstance(capacity);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		if(size == elements.length) {
			elements = grow(size);
		}
		elements[size++] = e;
		return false;
	}

	@Override
	public boolean addIf(E e, Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		return E[index];
	}

	@Override
	public void set(int index, E value) {
		
	}
	
	@SuppressWarnings("unchecked")
	private E[] createArrayInstance(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
	private E[] grow(int currentSize) {
		E[] newElememts = createArrayInstance(elements.length + defaultCapacity*2);
		for(int i = 0; i < currentSize; i++) {
			newElememts[i] = elements[i];
		}
		return newElememts;
	}

	@Override
	public void iterate(Consumer<E> consumer) {
		for(int i = 0; i < size; i++) {
			consumer.accept(elements[i]);
		}
	}

	@Override
	public int getCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int index, E value) {
		// TODO Auto-generated method stub
		
	}
}
