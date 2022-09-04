package generic.ftclass;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public  class CustomList<E> implements IList<E> {
	private static int defaultCapatcity = 4;
	private int size ;
	private E[] elements;
	
	public CustomList() {
		this(defaultCapatcity);
	}
	
	
	public CustomList(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Lon hon 0 chu");
		}
		elements = createArrayIntance(capacity);
	}
	
	@Override
	public boolean add(E e) {
		if (size == elements.length) {
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
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return elements[index];
	}
	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void set(int index, E value) {
		elements[index] = value;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@SuppressWarnings("unchecked")
	private E[] createArrayIntance(int lenght) {
		return (E[])Array.newInstance(Object.class, lenght);
	}
	private E[] grow(int currentSize) {
		E[] newElement = createArrayIntance(elements.length + defaultCapatcity*2);
		for ( int i = 0 ; i < currentSize; i++) {
			newElement[i] = elements[i];
		}
		return newElement;
	}
	@Override
	public void iterate(Consumer<E> consumer) {
		for (int i = 0 ; i < size; i++) {
			consumer.accept(elements[i]);
		}
	}
	
	@Override
	public int getCapacity() {
		
		return elements.length;
	}

}
