package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;



@RestController
@RequestMapping("/api/registrations")
public class RestRegistrationController {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	
	
	
	
	// http://localhost:8080/api/registrations
		
	@GetMapping
	public List<Registration> getAllReg(){	
		List<Registration> registrations = registrationRepository.findAll();
		return registrations;      
	    
	}
	

}
