package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import first.Student;

@Component("school")
public class School {
	private Student student;
	public School() {
		System.out.println("School()");
	}
	@Autowired
	public School(@Qualifier("student") Student student) {
		System.out.println("School(student)");
		this.student = student;
	}
	@Override
	public String toString() {
		return "School [student=" + student + "]";
	}
	
	
}
