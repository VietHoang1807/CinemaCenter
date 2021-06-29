package com.github.cinema.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Chair")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChairEntity {
	
	@Field(name = "Position")
	public String Position;
	
	@Field(name = "Chair_Types")
	public String ChairTypes;
	
	@Field(name = "Seat_Coding")
	public String Seat;
	
}
