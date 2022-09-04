package bean;

public class Word {
	private String name;

	public Word() {
		// TODO Auto-generated constructor stub
	}

	public Word(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Word [name=" + name + "]";
	}
	
}
