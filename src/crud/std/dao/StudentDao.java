package crud.std.dao;

import java.util.List;

import crud.Student;

interface StudentDao {
public List<Student>getStudentList();
int save(Student s);
int delete(Integer id);
int update(Integer i,Student std);
}
