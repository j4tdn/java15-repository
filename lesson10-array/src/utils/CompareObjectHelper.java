package utils;

import bean.ItemDetail;

@FunctionalInterface
public interface CompareObjectHelper {
   int compare(ItemDetail elements1 , ItemDetail elements2);
}
