package titv;

public class Author {
	private String authorName;
	private Date dateOfBirth;
	public Author(String authorName, Date dateOfBirth) {
		this.authorName = authorName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getAthorName() {
		return authorName;
		
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void printAuthor() {
		System.out.println(this.authorName);
	}
	
}
