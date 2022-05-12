package ls42;

public class Animal {
	protected String name;
	public Animal ( String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Eat() {
		System.out.println("tao đang ăn");
	}
	public void Drink() {
		System.out.println("ực ực ngon ghê");
	}
	public void Sleep() {
		System.out.println("khò khò khè khè");
	}
	
}
