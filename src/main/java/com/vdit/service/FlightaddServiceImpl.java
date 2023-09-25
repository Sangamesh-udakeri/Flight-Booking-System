package com.vdit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vdit.model.Flight;
import com.vdit.repository.FlightRepo;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class FlightaddServiceImpl implements Flightaddservice {

	@Autowired
	FlightRepo flightRepo;
	@Override
	public String addFlight(Flight flight) {
		
		 flightRepo.save(flight) ;
		 return "saved";
	}
	@Override
	public List<Flight> getFlights() {
		
		 List<Flight> findAll = flightRepo.findAll();
		 
		 return findAll;
	}
	@Override
	public String deleteFlight(Integer id) {
		flightRepo.deleteById(id);
		return "deleted";
	}

}
