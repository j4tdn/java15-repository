package generic.ftclass;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {

	private static int defautCapacity = 4;
	private int size;
	private E[] elements;

	public CustomList() {
		this(defautCapacity);
	}

	public CustomList(int capacity) {
		if (capacity <= 0) {
			throw new IllegalArgumentException("Capacity must be >= 0");
		}
		elements = createArrayInstance(capacity);
	}

	@Override
	public int size() {
		return size;
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
	public boolean add(int index, E e) {
		return false;
	}

	@Override
	public boolean addIf(E e, Predicate<E> predicate) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public boolean remove(Predicate<E> predicate) {
		return false;
	}

	@Override
	public E get(int index) {
		return elements[index];
	}

	@Override
	public void set(int index, E value) {
		elements[index] = value;
	}

	private E[] createArrayInstance(int length) {
		return (E[]) Array.newInstance(Object.class, length);
	}

	private E[] grow(int currentSize) {
		E[] newElement = createArrayInstance(elements.length + defautCapacity * 2);
		for (int i = 0; i < currentSize; i++) {
			newElement[i] = elements[i];
		}
		return newElement;
	}

	@Override
	public void interate(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			consumer.accept(elements[i]);
		}
	}

}
