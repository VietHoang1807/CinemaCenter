package com.github.cinema.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Cinema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CinemaEntity {

	@Id
	private String Id;
	
	@Field(name = "Cinema_Coding")
	private String Cinema;
	
	@Field(name = "Number_Chair")
	private String NumberChair;
	
	@Field(name = "Maintenance")
	private Boolean Maintenance;
	
	@Field(name = "Chair")
	private List<ChairEntity> ChairCencima;
	
	
}
