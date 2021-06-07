package com.github.cinema.entity;

import org.springframework.data.mongodb.core.mapping.Field;

public class ChairEntity {
	
	@Field(name = "Position")
	public String Position;
	
	@Field(name = "Chair_Types")
	public String ChairTypes;
	
	@Field(name = "Seat_Coding")
	public String Seat;
	
}
