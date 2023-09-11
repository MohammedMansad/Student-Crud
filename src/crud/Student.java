package crud;

import java.util.Objects;

public class Student {
	
	private int id;
	private String Name;
	private String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		Name = name;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", course=" + course + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Name, course, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name) && Objects.equals(course, other.course) && id == other.id;
	}
	

}
