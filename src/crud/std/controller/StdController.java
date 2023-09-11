package crud.std.controller;

import java.util.Iterator;
import java.util.List;

import crud.Student;
import crud.std.service.StudentServiceImpl;

public class StdController {

	public static void main(String[] args) {
		
		
		//getting all the students record
		
		StudentServiceImpl  stdService=new  StudentServiceImpl();
		//stdService.getStudentList().forEach(System.out::println);
		
		//add student
		/*
		Student std=new Student(4,"danish","BHM");
		Integer status = stdService.save(std);
		if(status==0)
		{
			System.out.println("Not Saved");
		}
		else
		{
			System.out.println("Successfully saved");
			stdService.getStudentList().forEach(System.out::println);
		}
		
		*/
		//delete student
		
		/*
		int studentId=4;
		Integer status1 = stdService.delete(studentId);
		if(status1==0)
		{
			System.out.println("No Id Found");
		}
		else
		{
			System.out.println("Deleted Susscessfully");
			stdService.getStudentList().forEach(System.out::println);
		}
		
		*/
		
		//update
		
		Student std=new Student();
		std.setId(3);
		std.setName("Mansad");
		std.setCourse("MBBS");
		Integer status = stdService.update(1, std);
		{
			if(status==0)
			{
				System.out.println("Not updated");
			}
			else
			{
				System.out.println("Updated Succesfully");
				stdService.getStudentList().forEach(System.out::println);
			}
		}
		
			
	}

}
