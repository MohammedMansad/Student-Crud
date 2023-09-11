package crud.std.service;

import java.util.List;

import crud.Student;

interface StudentService {
	public List<Student>getStudentList();
	Integer save(Student s);
	Integer delete(Integer sId);
	Integer update(Integer i,Student std);

}
