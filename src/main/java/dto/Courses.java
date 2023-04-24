package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	private String subject;
	
	@ManyToMany(mappedBy = "listofcourses")
	private List<Student> listofstudent;

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getListofstudent() {
		return listofstudent;
	}

	public void setListofstudent(List<Student> listofstudent) {
		this.listofstudent = listofstudent;
	}
	

}
