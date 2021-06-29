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
