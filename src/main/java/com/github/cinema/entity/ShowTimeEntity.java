package com.github.cinema.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "ShowTime")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowTimeEntity {

	@Id
	private String Id;
	
	@Field(name = "Code_Cinema")
	private String CodeCinema;
	
	@Field(name = "Code_Film")
	private String CodeFilm;
	
	@Field(name = "Code_Show")
	private String CodeShow;
	
	@Field(name = "Surcharge")
	private int Surcharge;
	
	@Field(name = "Start_Hour")
	private LocalDateTime StartHour;
	
	@Field(name = "End_Hour")
	private LocalDateTime EndHour;
	
	@Field(name = "Date")
	private LocalDate Date;
}
