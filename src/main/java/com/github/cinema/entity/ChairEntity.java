package com.github.cinema.entity;

import org.springframework.data.annotation.Id;
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
	
	@Id
	private String Id;
	
	@Field(name = "Position")
	private String Position;
	
	@Field(name = "Chair_Types")
	private String ChairTypes;
	
	@Field(name = "Seat_Coding")
	private String Seat;
	
}
