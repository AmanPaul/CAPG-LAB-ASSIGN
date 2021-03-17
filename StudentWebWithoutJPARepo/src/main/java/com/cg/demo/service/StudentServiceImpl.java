package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.dao.StudentDao;
import com.cg.demo.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDao sDao;
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sDao.getAllStudent();
	}

	@Override
	public List<Student> createStudent(Student stu) {
		
		return sDao.createStudent(stu);
	}

}
