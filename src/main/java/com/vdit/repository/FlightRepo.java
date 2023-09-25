package com.vdit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vdit.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Integer> {

	
}
