package bean;

public class Owner {
	private String name;
	
	public Owner() {
		// TODO Auto-generated constructor stub
	}

	public Owner(String name) {
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
		return "Owner [name=" + name + "]";
	}
	
	
}
