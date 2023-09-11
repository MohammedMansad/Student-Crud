package crud.std.databas;

import java.util.ArrayList;
import java.util.List;

import crud.Student;

public class StudentDatabas {

	public static List<Student>stdlist=null;
	
	static
	{
		
		stdlist=new ArrayList<>();
		stdlist.add(new Student(1, "ziyad", "BSC"));
		stdlist.add(new Student(2, "mahir", "HSC"));
		stdlist.add(new Student(3,"ayan","BCOM"));
	}
}

