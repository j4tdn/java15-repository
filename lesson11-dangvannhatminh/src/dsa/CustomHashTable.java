package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import bean.NodeSpending;


public class CustomHashTable implements IHashTable {

	private static final int DEFAULT_CAPACITY = 10;
	private static final double DEFAULT_LOAD_FACTOR = 0.5;

	double loadFactor;
	int size = 0, capacity, threshold;

	List<NodeSpending>[] table;

	public CustomHashTable()
	{
		this(DEFAULT_LOAD_FACTOR,DEFAULT_CAPACITY);
	}
	public CustomHashTable(int capacity)
	{
		this(DEFAULT_LOAD_FACTOR,capacity);
	}
	
	public CustomHashTable(double loadFactor, int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Capacity not negative");
		if (loadFactor <= 0)
			throw new IllegalArgumentException("LoadFactor not negative or equals zero");
		this.loadFactor = loadFactor;
		this.capacity = Math.max(DEFAULT_CAPACITY, capacity);
		this.threshold = (int) (this.capacity * loadFactor);
		table = new ArrayList[capacity];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int hashCodeToIndex(int hashedKey) {
		if (hashedKey < 0)
			hashedKey *= -1;
		return hashedKey % capacity;
	}

	@Override
	public void clear() {
		Arrays.fill(table, null);
		size = 0;
	}

	@Override
	public boolean contain(String key) {
		int index = hashCodeToIndex(key.hashCode());
		List<NodeSpending> arr = table[index];
		if (arr == null || arr.isEmpty())
			return false;
		else {
			for (NodeSpending e : arr) {
				if (e.getKeyInfoSpending().equals(key)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public double put(String key, double value) {
		int index = hashCodeToIndex(key.hashCode());
		List<NodeSpending> arr = table[index];
		if (arr == null) {
			table[index] = arr = new ArrayList<>();
			addtoArray(key, value, arr);
		}else if(arr.isEmpty())
		{
			addtoArray(key, value, arr);
		}else
		{
			for(NodeSpending node : arr)
			{
				if(node.getKeyInfoSpending().equals(arr))
				{
					double oldValue = node.getValueMoney();
					node.setValueMoney(value);
					return oldValue;
				}
			}
			addtoArray(key, value, arr);
		}
		return 0;
	}

	private void addtoArray(String key, double value, List<NodeSpending> arr) {
		arr.add(new NodeSpending(key, value));
		size++;
		if (size > threshold)
			grow();
	}

	private void grow() {
		this.capacity *= 2;
		this.threshold = (int)(this.capacity*this.loadFactor);
		List<NodeSpending>[] newTable = new ArrayList[capacity];
		
		for(int i = 0 ; i < table.length;i++)
		{
			if(table[i] == null)
				continue;
			for(NodeSpending e : table[i])
			{
				int index = hashCodeToIndex(e.getKeyInfoSpending().hashCode());
				List<NodeSpending> arr = newTable[index];
				if( arr == null)
				{
					newTable[index] = arr = new ArrayList<>();
				}
				arr.add(e);
			}
			table[i].clear();
			table[i] = null;
		}
		table = newTable;
		
	}

	@Override
	public Double get(String key) {
		int index = hashCodeToIndex(key.hashCode());
		List<NodeSpending> arr = table[index];
		if(arr == null || arr.isEmpty()) return null;
		for(NodeSpending node : arr)
		{
			if(node.getKeyInfoSpending().equals(key))
			{
				return node.getValueMoney();
			}
		}
		return null;
	}

	@Override
	public Double remove(String key) {
		int index = hashCodeToIndex(key.hashCode());
		List<NodeSpending> arr = table[index];
		
		if(arr == null || arr.isEmpty()) return null;
		for(NodeSpending node : arr)
		{
			if(node.getKeyInfoSpending().equals(key))
			{
				arr.remove(node);
				size--;
				return node.getValueMoney();
			}
		}
		return null;
	}
	@Override
	public List<NodeSpending> toList() {
		List<NodeSpending> result = new ArrayList<>();
		for(int i = 0; i<table.length;i++)
		{
			if(table[i] == null || table[i].isEmpty())
			{
				continue;
			}
			for(NodeSpending node : table[i])
			{
				result.add(node);
			}
		}
		return result;
	}
	@Override
	public List<NodeSpending> sortByKey(Comparator<NodeSpending> c) {
		List<NodeSpending> result = this.toList();
		result.sort(c);
		return result;
	}
	@Override
	public List<NodeSpending> sortByValue(Comparator<NodeSpending> c) {
		List<NodeSpending> result = this.toList();
		result.sort(c);
		return result;
	}

}
