package com.vdit.service;

import java.util.List;

import com.vdit.model.Flight;
import com.vdit.requestmapping.UserRequest;
import com.vdit.response.UserResponse;

public interface UserRequestService {

	public List<UserResponse> getFlights(UserRequest request);
}
