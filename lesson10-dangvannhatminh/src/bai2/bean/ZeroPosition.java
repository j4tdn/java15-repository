package bai2.bean;

public class ZeroPosition {
	private int indexRow;
	private int indexCol;
	
	public ZeroPosition(int indexRow, int indexCol) {
		super();
		this.indexRow = indexRow;
		this.indexCol = indexCol;
	}
	public int getIndexRow() {
		return indexRow;
	}
	public void setIndexRow(int indexRow) {
		this.indexRow = indexRow;
	}
	public int getIndexCol() {
		return indexCol;
	}
	public void setIndexCol(int indexCol) {
		this.indexCol = indexCol;
	}
	
}
