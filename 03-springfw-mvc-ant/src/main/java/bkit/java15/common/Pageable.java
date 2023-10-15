package bkit.java15.common;

public class Pageable {

	public static final int CONFIGURED_ITEMS_PER_PAGE = 5;

	private int pageNum; // current page number
	private int pageSize; // amount of items per page

	private Pageable(int pageNum, int pageSize) {
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}

	public static Pageable of(int pageNum, int pageSize) {
		return new Pageable(pageNum, pageSize);
	}

	public int getOffset() {
		return (pageNum - 1) * pageSize;
	}

	public int getRowCount() {
		return pageSize;
	}

}
