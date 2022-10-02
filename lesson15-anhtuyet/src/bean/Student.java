package bean;
import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String name;
    private byte age;
    private String gender;;
    private float gpa;
 
    public Student() {
    }
    
    	

	public Student(int id, String name, byte age, String gender, float gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.gpa = gpa;
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

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", gpa=" + gpa + "]";
	}
}
    