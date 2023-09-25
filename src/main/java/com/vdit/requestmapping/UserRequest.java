package com.vdit.requestmapping;

import java.time.LocalDate;

import lombok.Data;
@Data
public class UserRequest {

	private String source;
	private String destination;
	private LocalDate journeyDate;
}
