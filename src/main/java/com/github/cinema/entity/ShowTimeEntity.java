package com.github.cinema.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ShowTime")
public class ShowTimeEntity {

	@Id
	public String Id;
	
	@Field(name = "Code_Cinema")
	public String CodeCinema;
	
	@Field(name = "Code_Film")
	public String CodeFilm;
	
	@Field(name = "Code_Show")
	public String CodeShow;
	
	@Field(name = "Surcharge")
	public int Surcharge;
	
	@Field(name = "Start_Hour")
	public LocalDateTime StartHour;
	
	@Field(name = "End_Hour")
	public LocalDateTime EndHour;
	
	@Field(name = "Date")
	public LocalDate Date;
}
