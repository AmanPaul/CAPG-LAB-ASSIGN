package com.cg.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.demo.bean.Trainee;

@Repository
public interface TraineeJpaRepository  extends JpaRepository<Trainee,Integer>{
	public List<Trainee> findByTraineeName(String traineeName);
}
