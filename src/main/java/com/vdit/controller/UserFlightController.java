package com.vdit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vdit.model.Flight;
import com.vdit.requestmapping.UserRequest;
import com.vdit.response.UserResponse;
import com.vdit.service.UserRequestService;

@RestController
@RequestMapping("/user")
public class UserFlightController {

	@Autowired
	UserRequestService userRequestService;
	
	@GetMapping("/getFlights")
	public ResponseEntity<List<UserResponse>> getFlights(UserRequest userreq){
		
		List<UserResponse> flights = userRequestService.getFlights(userreq);
		
		return new ResponseEntity<List<UserResponse>>(flights,HttpStatus.OK);
	}
}
