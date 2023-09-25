package com.vdit.service;

import java.util.List;

import com.vdit.model.Flight;

public interface Flightaddservice {

	public String addFlight(Flight flight);
	public List<Flight> getFlights();
	public String deleteFlight(Integer id);
	
	
}
