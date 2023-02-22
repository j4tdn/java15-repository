package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Class")
public class Class {
		public static final String GET_ITEM_GROUPS = "GET_ITEM_GROUPS";
		@Id
		@Column(name = "Id")
		private Integer id;
		
		@Column(name = "Name")
		private String name;
		@Column(name = "Teacher")
		private String teacher;
		
		
		public Class() {
		}
		public Class(Integer id, String name, String teacher) {
			super();
			this.id = id;
			this.name = name;
			this.teacher = teacher;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTeacher() {
			return teacher;
		}

		public void setTeacher(String teacher) {
			this.teacher = teacher;
		}

		@Override
		public String toString() {
			return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
		}
		
		
}
