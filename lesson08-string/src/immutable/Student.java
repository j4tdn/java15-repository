package immutable;

public class Student {
	private String name;
	private String phone;
	private boolean gender;
	private String hobbies;

	public Student() {
	}

	public Student(String name, String phone, boolean gender,
			String hobbies) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ","
		+ " gender=" + gender + ", hobbies=" + hobbies + "]";
	}
		
	public static void main(String[] args) {
		// 1. Join, 094 329 2365, Male, English-Math
		// 2. Kate, 034 898 2514, Female, Biology-Chemistry
		// class: Student > name, phone, gender, hobbies
		String line = "Join, 094 329 4321, Male, English-Math";
		Student student = transformer(line);
		System. out. println(student);
	}
	private static Student transformer(String line) {
		Student student =null;
		String[] elements = line.split(",\\s");
		if(elements.length ==4) {
			student = new Student(elements[0], elements[1],
			"male".equalsIgnoreCase(elements[2]),elements[3]);
		}
		return student;
	}
	
}
	
