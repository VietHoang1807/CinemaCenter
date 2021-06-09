package com.github.cinema.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChairEntity {
	
	@Field(name = "Position")
	private String Position;
	
	@Field(name = "Chair_Types")
	private String ChairTypes;
	
	@Field(name = "Seat_Coding")
	private String Seat;
	
}
