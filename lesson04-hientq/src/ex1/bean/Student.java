package ex1.bean;

public class Student {
	private int id;
	private String name;
	private float theoryMark, practiceMark;
	
	public Student() {
		
	}
	
	public Student(int id, String name, float theoryMark, float practiceMark) {
		this.id = id;
		this.name = name;
		this.theoryMark = theoryMark;
		this.practiceMark = practiceMark;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getTheoryMark() {
		return this.theoryMark;
	}
	
	public void setTheoryMark(float theoryMark) {
		this.theoryMark = theoryMark;
	}
	
	public float getPracticeMark() {
		return this.practiceMark;
	}
	
	public void setPracticeMark(float practiceMark) {
		this.practiceMark = practiceMark;
	}
	
	public String toString() {
		return "id: "+this.id+"; name: "+this.name+"; Theory Mark: "+this.theoryMark+"; Practice Mark: "+this.practiceMark;
	}
	
	public float getAverage() {
		return (this.theoryMark + this.practiceMark)/2;
	}
}
