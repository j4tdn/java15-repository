package view;

public class Student {
    private int id;
    private String name;
    private float Tmark;
    private float Pmark;
    
    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, float tmark, float pmark) {
		super();
		this.id = id;
		this.name = name;
		Tmark = tmark;
		Pmark = pmark;
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

	public float getTmark() {
		return Tmark;
	}

	public void setTmark(float tmark) {
		Tmark = tmark;
	}

	public float getPmark() {
		return Pmark;
	}

	public void setPmark(float pmark) {
		Pmark = pmark;
	}
    public float caculateAverageMark() {
    	return (Tmark + Pmark)/2;	
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Tmark=" + Tmark + ", Pmark=" + Pmark + "]";
	}
    
}
