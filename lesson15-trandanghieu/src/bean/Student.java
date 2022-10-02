package bean;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private double point;
	private String genfer;
	
	public Student() {
		
	}

	public Student(int id, String name, double point, String genfer) {
		this.id = id;
		this.name = name;
		this.point = point;
		this.genfer = genfer;
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

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getGenfer() {
		return genfer;
	}

	public void setGenfer(String genfer) {
		this.genfer = genfer;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + ", genfer=" + genfer + "]";
	}
	public static Student transfer( String line) {
		String[] elements=line.split(", ");
		if(elements.length!=4) {
			System.out.println(line+" ..has... wrong fomat");
			return null;
		}
		return new Student(
				Integer.parseInt(elements[0]),
				elements[1],
				Double.parseDouble(elements[2]),
				elements[3]
				);
	}
	  @Override
	    public boolean equals(final Object o) {
	        if (this == o) return true;

	        if (o == null || getClass() != o.getClass()) return false;

	        final Student stu = (Student) o;

	        return getGenfer().equals(stu.getGenfer());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(genfer);
	    }

	
	
	
}
