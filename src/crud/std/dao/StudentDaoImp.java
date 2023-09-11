package crud.std.dao;

import java.util.Iterator;
import java.util.List;

import crud.Student;
import crud.std.databas.StudentDatabas;

public class StudentDaoImp  implements StudentDao{

	@Override
	public List<Student> getStudentList() {
		
		return StudentDatabas.stdlist;
	}

	@Override
	public int save(Student s) {
		// TODO Auto-generated method stub
		StudentDatabas.stdlist.add(s);
		return 1;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		Iterator<Student> iterator = StudentDatabas.stdlist.iterator();
		while(iterator.hasNext())
		{
			Student sid = iterator.next();
			if(sid.getId()==id)
			{
				iterator.remove();
			}
			
			
		}
		return 1;
	}

	@Override
	public int update(Integer i, Student std) {
		// TODO Auto-generated method stub
		
		StudentDatabas.stdlist.set(i, std);
		return 1;
	}

}
