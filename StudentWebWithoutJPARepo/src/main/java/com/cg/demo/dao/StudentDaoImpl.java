package com.cg.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.demo.model.Student;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao{
	@PersistenceContext
	EntityManager em;
	@Override
	public List<Student> createStudent(Student stu) {
		em.persist(stu);
		return getAllStudent();
	}

	@Override
	public List<Student> getAllStudent() {
		TypedQuery<Student> q=em.createQuery("select s from Student s",Student.class);
		return q.getResultList();
	}

}
