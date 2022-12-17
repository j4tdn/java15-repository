package persistence;

public class Title {
	private Integer id;
	private String name;

	public Title() {
		// TODO Auto-generated constructor stub
	}
    
	
	
	public Title(Integer id) {
		super();
		this.id = id;
	}



	public Title(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Title [id=" + id + ", name=" + name + "]";
	}
	
}
