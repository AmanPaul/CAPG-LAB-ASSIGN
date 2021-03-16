package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.bean.Trainee;
import com.cg.demo.dao.TraineeJpaRepository;

@Service
public class TraineeService implements TraineeServiceInt{
	@Autowired
	TraineeJpaRepository tDao;

	@Override
	public List<Trainee> printAllTrainee() {
		// TODO Auto-generated method stub
		return tDao.findAll();
	}

	@Override
	public Trainee findTrainee(int traineeId) {
		if(tDao.findById(traineeId).isPresent()) {
			return tDao.findById(traineeId).get();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Trainee> createTrainee(Trainee trn) {
		tDao.saveAndFlush(trn);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> removeTrainee(int traineeId) {
		tDao.deleteById(traineeId);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> updateTrainee(Trainee trn) {
		tDao.saveAndFlush(trn);
		return tDao.findAll();
	}

	@Override
	public List<Trainee> findTraineeByName(String traineeName) {
		return tDao.findByTraineeName(traineeName);
	}
}
