package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Result")
public class Result {
	@EmbeddedId
	private Id id;
	
	
	@Column(name = "Score")
	private Integer score;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StudentId", referencedColumnName = "StudentId",insertable = false, updatable = false)
	private Student student;
	
	public Result() {
	}

	
	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "Result [id=" + id + ", score=" + score + ", student=" + student + "]";
	}

	@Embeddable
	public static class Id implements Serializable{
		private static final long serialVersionUID = 6663919049441423303L;
		@Column(name = "StudentId",insertable = false, updatable = false)
		private Integer studentId;
		
		@Column(name = "SubjectName")
		private String subject;

		public Id() {
		}

		public Id(Integer studentId, String subject) {
			this.studentId = studentId;
			this.subject = subject;
		}

		public Integer getStudentId() {
			return studentId;
		}

		public void setStudentId(Integer studentId) {
			this.studentId = studentId;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Id [studentId=" + studentId + ", subject=" + subject + "]";
		}
		
		
		
	}
	
	
	
	
}
