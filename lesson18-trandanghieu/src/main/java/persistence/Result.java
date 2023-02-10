package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	@Id
	@Column(name="student_id")
	private Integer student_id;
	
	@Column(name="subject")
	private Integer subject;
	
	@Column(name="score")
	private float  score;
	public Result() {
	}
	public Result(Integer student_id, Integer subject, float score) {
		this.student_id = student_id;
		this.subject = subject;
		this.score = score;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public Integer getSubject() {
		return subject;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Result [student_id=" + student_id + ", subject=" + subject + ", score=" + score + "]";
	}
	
	

}
