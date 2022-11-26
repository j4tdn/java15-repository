package generic.ftclass;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {
	
	private static int defaultCapacity = 4;
	private int size;
	private E[] elements;
	
	public CustomList() {
		this(defaultCapacity);
	}
	
	public CustomList(int capacity) {
		if(capacity <=0) {
			throw new IllegalArgumentException("Capacity must be >=0");
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
		if(size == elements.length) {
			elements = grow(size);
		}
		elements[size++] = e;
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
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
	public boolean removeif(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return elements[index];
	}

	@Override
	public void set(int index,E value) {
		// TODO Auto-generated method stub
		elements[index] = value;
	}
	@SuppressWarnings("unchecked")
	private E[] createArrayInstance(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
	private E[] grow(int currentSize) {
		E[] newElements = createArrayInstance(elements.length + defaultCapacity*2);
		for (int i = 0; i < currentSize; i++) {
			newElements[i] = elements[i];
		}
		return newElements;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void iterate(Consumer<E> consumer) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			consumer.accept(elements[i]);
		}
		
	}

}
