package utils;

import bean.ItemDetail;

@FunctionalInterface
public interface CompareObjectHelper {
	int compare(ItemDetail i1, ItemDetail i2);
}
