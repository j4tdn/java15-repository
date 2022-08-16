package common;

import java.util.Objects;

public class Pair<L, R> {
	private L left;
	private R right;
	
	public Pair() {
	}
	
	public Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public L getLeft() {
		return left;
	}
	
	public void setLeft(L left) {
		this.left = left;
	}
	
	public R getRight() {
		return right;
	}
	
	public void setRight(R right) {
		this.right = right;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Pair)) {
			return false;
		}
		
		Pair that = (Pair)o;
		
		return getLeft().equals(that.getLeft()) && getRight().equals(that.getRight());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getLeft(), getRight());
	}
	
	@Override
	public String toString() {
		return left + ", " + right;
	}
}