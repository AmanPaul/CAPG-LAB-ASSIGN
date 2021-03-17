package com.cg.demo.service;

import java.util.List;

import com.cg.demo.model.Student;

public interface StudentService {
	public List<Student> getAllStudent();
	public List<Student> createStudent(Student stu);
}
