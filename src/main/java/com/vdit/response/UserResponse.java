package com.vdit.response;

import java.time.LocalDate;

import lombok.Data;
@Data
public class UserResponse {

	private String flightName;
	private String source;
	private String destination;
	private String seatClass;
	private Double price;
	private LocalDate   flyingDate;
}
