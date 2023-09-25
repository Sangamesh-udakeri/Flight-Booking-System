package com.vdit.service;

import java.beans.Beans;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.vdit.model.Flight;
import com.vdit.repository.FlightRepo;
import com.vdit.requestmapping.UserRequest;
import com.vdit.response.UserResponse;

@Service
public class UserRequestServiceImpl implements UserRequestService {

	@Autowired
	FlightRepo flightRepo;
	@Override
	public List<UserResponse> getFlights(UserRequest request) {
		
		List<UserResponse> userresponse=new ArrayList<>();
		Flight builder=new Flight();
		String source = request.getSource();
		String destination = request.getDestination();
		LocalDate journeyDate = request.getJourneyDate();
		if(source!=null && source!="") {
			builder.setSource(source);
		}
		if(destination!=null && destination!="") {
			builder.setDestination(destination);
		}
		if(journeyDate!=null ) {
			builder.setFlyingDate(journeyDate);
		}
		Example<Flight> example = Example.of(builder);
		
		List<Flight> findAll = flightRepo.findAll(example);
		if(findAll==null) {
			userresponse.add(null);
		}
		System.out.println(findAll);
		for(Flight flight:findAll) {
			UserResponse response=new UserResponse();
			response.setFlightName(flight.getFlightName());
			response.setSource(flight.getSource());
			response.setDestination(flight.getDestination());
			response.setFlyingDate(flight.getFlyingDate());
			response.setPrice(flight.getPrice());
			response.setSeatClass(flight.getSeatClass());
			userresponse.add(response);
		}
		return userresponse;
	}

	
}
