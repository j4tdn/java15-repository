package ex01;

public class Students {
	private int id;
	private String name;
	private float lt;
	private float th;
   
	public Students() {
	}

	public Students(int id, String name, float lt, float th) {
		this.id = id;
		this.name = name;
		this.lt = lt;
		this.th = th;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLt() {
		return lt;
	}

	public void setLt(float lt) {
		this.lt = lt;
	}

	public float getTh() {
		return th;
	}

	public void setTh(float th) {
		this.th = th;
	}

	@Override
	public String toString() {
		return id + "    " + name + "    " + lt + "    " + th + "    " + Utils.dtb(lt, th);
	}

}
