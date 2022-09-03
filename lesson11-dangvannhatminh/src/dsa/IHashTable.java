package dsa;

import java.util.Comparator;
import java.util.List;

import bean.NodeSpending;

public interface IHashTable {
	int size();
	boolean isEmpty();
	int hashCodeToIndex(int hashedKey);
	void clear();
	boolean contain(String key);
	double put(String key, double value);
	Double get(String key);
	Double remove(String key);
	List<NodeSpending> toList();
	List<NodeSpending> sortByKey(Comparator<NodeSpending> c);
	List<NodeSpending> sortByValue(Comparator<NodeSpending> c);
}
