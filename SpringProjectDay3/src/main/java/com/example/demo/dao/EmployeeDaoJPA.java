package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee, Integer>{

}
