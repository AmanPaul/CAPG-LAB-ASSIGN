package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.bean.Trainee;
import com.cg.demo.service.TraineeService;
import com.cg.demo.service.TraineeServiceInt;


@RestController
@RequestMapping("/trainee")
public class TraineeController {
	@Autowired
	TraineeServiceInt jpaService;
	
	@GetMapping
	public List<Trainee> printAllTrainee(){
		return jpaService.printAllTrainee();
	}
	@GetMapping("/{traineeId}")
	public ResponseEntity<Trainee> findEmployee(@PathVariable int traineeId) {
		Trainee t=jpaService.findTrainee(traineeId);
		if(t!=null)
			return new ResponseEntity<Trainee>(t,HttpStatus.OK); 
		else
			return new ResponseEntity<Trainee>(HttpStatus.NOT_FOUND);
	}
	@PostMapping
	public List<Trainee> saveEmployee(@RequestBody Trainee trn) {
			return jpaService.createTrainee(trn);
	}
	@DeleteMapping("/{traineeId}")
	public List<Trainee> deleteEmployee(@PathVariable int traineeId){
		return jpaService.removeTrainee(traineeId);
	}
	@PutMapping
	public List<Trainee> updateTrainee(@RequestBody Trainee trn){
		return jpaService.updateTrainee(trn);
	}
	@GetMapping("name/{traineeName}")
	public List<Trainee> findTraineeByName(@PathVariable String traineeName) {
		return jpaService.findTraineeByName(traineeName);
	}
}
