package com.vdit.model;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="flights")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	private String flightName;
	private String source;
	private String destination;
	private String seatClass;
	private Double price;
	private LocalDate   flyingDate;
	
}
