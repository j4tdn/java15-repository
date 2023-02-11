package persistence;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Result {
	@Id
	private int id;
	
	@Id
	@Column(name = "subject")
	private String subject;
	
	@Column(name = "score")
	private double score;
	
	public Result() {
	}

	public Result(int id, String subject, double score) {
		super();
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", subject=" + subject + ", score=" + score + "]";
	}
	
}
