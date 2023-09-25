package com.vdit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vdit.model.Flight;
import com.vdit.service.FlightaddServiceImpl;

@RestController
@RequestMapping("/admin")
public class FlightController {

	@Autowired
	FlightaddServiceImpl flightaddServiceImpl;
	@PostMapping("/save")
	public ResponseEntity<String> addFlight(Flight flight){
	
		String addFlight = flightaddServiceImpl.addFlight(flight);
		
		return new ResponseEntity<String>(addFlight,HttpStatus.OK);
		
	}
	@GetMapping("/get")
	public ResponseEntity<List<Flight>> getFlights(){
		
		List<Flight> flights = flightaddServiceImpl.getFlights();
		
		return new ResponseEntity<List<Flight>>(flights,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteFlight(@PathVariable  Integer id){
		
		String deleteFlight = flightaddServiceImpl.deleteFlight(id);
		return new ResponseEntity<String>(deleteFlight,HttpStatus.OK);
		
	}
	
	
}
