package com.cg.demo.dao;

import java.util.List;

import com.cg.demo.model.Student;

public interface StudentDao {
	public List<Student> createStudent(Student stu);
	public List<Student> getAllStudent();
	
}
