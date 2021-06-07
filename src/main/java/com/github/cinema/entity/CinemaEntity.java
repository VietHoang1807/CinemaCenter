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
	public String Id;
	
	@Field(name = "Cinema_Coding")
	public String Cinema;
	
	@Field(name = "Number_Chair")
	public String NumberChair;
	
	@Field(name = "Maintenance")
	public Boolean Maintenance;
	
	@Field(name = "Chair")
	public List<ChairEntity> ChairCencima;
	
	
}
