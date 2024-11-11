package com.tis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tis.model.Train;
import com.tis.repository.TrainRepository;

@RestController
public class TrainController {
	@Autowired
	private TrainRepository trainRepository;
	@RequestMapping("/hello")
	public String hello1() {
		return "This is from hello ";
	}
	@GetMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
	@GetMapping("/welcome1")
	public String welcome1(){
		return "welcome1";
	}
	@RequestMapping(method = RequestMethod.POST,value = "/train")
	public Train createTrain(@RequestBody Train train) {
		
		return trainRepository.save(train);
	}
	
	
}






