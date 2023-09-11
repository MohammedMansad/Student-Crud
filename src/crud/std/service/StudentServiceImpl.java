package crud.std.service;

import java.util.Iterator;
import java.util.List;

import crud.Student;
import crud.std.dao.StudentDaoImp;

public class StudentServiceImpl implements StudentService
{

	@Override
	public List<Student> getStudentList() {
		StudentDaoImp stdimpl=new StudentDaoImp();
		
		
		return stdimpl.getStudentList();
	}

	@Override
	public Integer save(Student s) {
		// TODO Auto-generated method stub
		int count=1;
		StudentDaoImp stdimpl=new StudentDaoImp();
		List<Student> studentList = stdimpl.getStudentList();
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext())
		{
			Student st = iterator.next();
			if(st.getId()==s.getId())
			{
				count=0;
			}
		}
		if(count>0)
		{
			stdimpl.save(s);
			
		}
		
		return count;
	}

	@Override
	public Integer delete(Integer sId) {
		// TODO Auto-generated method stub
		int count=0;
		StudentDaoImp stdimpl=new StudentDaoImp();
		List<Student> studentList = stdimpl.getStudentList();
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext())
		{
			Student std = iterator.next();
			if(std.getId()==sId)
			{
				count=1;
				
			}
		}
		if(count>0)
		{
			stdimpl.delete(sId);
		}
		return count;
	}

	@Override
	public Integer update(Integer i, Student std) {
		// TODO Auto-generated method stub
		int status=0;
		StudentDaoImp stdimpl=new StudentDaoImp();
		List<Student> studentList = stdimpl.getStudentList();
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext())
		{
			Student s = iterator.next();
			if(s.getId()==std.getId())
			{
				status=1;
			}
		}
		if(status>0)
		{
			stdimpl.update(i, std);
		}
		
		return status;
	}

}
