package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StuId;
	private String Stuname;
	private int age;
	
	@ManyToMany
	@JoinTable(joinColumns = {@JoinColumn(name = "StuId")},inverseJoinColumns = {@JoinColumn(name = "courseid")})
	          //(or)
	          //(joinColumns = {@JoinColumn},inverseJoinColumns = {@JoinColumn})
	
	private List<Courses> listofcourses;

	public int getStuId() {
		return StuId;
	}

	public void setStuId(int stuId) {
		StuId = stuId;
	}

	public String getStuname() {
		return Stuname;
	}

	public void setStuname(String stuname) {
		Stuname = stuname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Courses> getListofcourses() {
		return listofcourses;
	}

	public void setListofcourses(List<Courses> listofcourses) {
		this.listofcourses = listofcourses;
	}
	
}
