package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.model.Student;
import com.cg.demo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentService eService;
	@GetMapping
	public List<Student> printAllStudent(){
		return eService.getAllStudent();
	}
	@PostMapping
	public List<Student> saveStudent(@RequestBody Student obj){
		return eService.createStudent(obj);
	}
}
