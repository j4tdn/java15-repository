package bean;

public enum Oder {
	hai(0), ba(1), tư(2), năm(3), sáu(4),bảy(5),tám(6),chín(7),mười(10),J(8),Q(9),K(9),A(10);

	private final int value;

	Oder(final int value) {
		this.value = value;

	}

	public int getValue() {
		return this.value;
	}

}
