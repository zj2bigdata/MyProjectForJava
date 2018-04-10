package smp.studentDao;

import java.util.List;

import smp.student.Student;

public interface StudentIF {
	public List<Student> queryAllStudent();
	public boolean insertSingleStudent(Student s);
	public boolean updateSingleStudent(Student s);
	public boolean deleteSingleStudent(String s);
}
