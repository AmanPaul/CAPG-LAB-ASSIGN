package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Employee;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee, Integer>{
	public List<Employee> findByName(String name);
	@Query("select e from Employee e where e.salary<=:sal")
	public List<Employee> findBySalary(@Param("sal")double salary);
}
