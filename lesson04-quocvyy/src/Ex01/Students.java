package Ex01;

public class Students {
	private String name ;
	private int id ;
	private float pointlt;
	private float pointth;

	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Students(String name, int id, float pointlt, float pointth) {
		super();
		this.name = name;
		this.id = id;
		this.pointlt = pointlt;
		this.pointth = pointth;
	}


	@Override
	public String toString() {
		return "Students [name=" + name + ", id=" + id + ", pointlt=" + pointlt + ", pointth=" + pointth + "]";
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getPointlt() {
		return pointlt;
	}


	public void setPointlt(float pointlt) {
		this.pointlt = pointlt;
	}


	public float getPointth() {
		return pointth;
	}


	public void setPointth(float pointth) {
		this.pointth = pointth;
	}
	

}
