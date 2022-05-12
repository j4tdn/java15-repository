
public class Course {
	private String className, courseName;
	public Course(String className, String courseName) {
		this.className = className;
		this.courseName = courseName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	@Override
	public String toString() {
		return this.className + this.courseName;
	}
	
	
}
