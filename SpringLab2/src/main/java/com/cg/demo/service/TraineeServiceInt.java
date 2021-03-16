package com.cg.demo.service;

import java.util.List;

import com.cg.demo.bean.Trainee;


public interface TraineeServiceInt {
	public List<Trainee> printAllTrainee();
	public Trainee findTrainee(int traineeId) ;
	public List<Trainee> createTrainee(Trainee trn);
	public List<Trainee> removeTrainee(int traineeId);
	public List<Trainee> updateTrainee(Trainee trn) ;
	public List<Trainee> findTraineeByName(String traineeName);
}
