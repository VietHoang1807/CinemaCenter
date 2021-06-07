package com.github.cinema.entity;

import java.io.InputStream;
import java.time.LocalDate;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Show_Film")
public class ShowFilmEntity {
	
	@Id
	public String Id;
	
	@Field(name = "Code_Film")
	public String CodeFilm;
	
	public Integer Fllows;
	
	public LocalDate DayShow;
	
	public LocalDate EndShow;
	
	public String TypeFilm;
	
	public String Descibe;
	
	public Binary Image1;
	
	public Binary Image2;
	
	public Binary Image3;
	
	public Binary Image4;
	
	public Binary Image5;
	
	public InputStream Video;
	
	
}
