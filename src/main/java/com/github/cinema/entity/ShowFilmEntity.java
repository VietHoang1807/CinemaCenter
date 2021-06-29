package com.github.cinema.entity;

import java.io.InputStream;
import java.time.LocalDate;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Show_Film")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowFilmEntity {
	
	@Id
	public String Id;
	
	@Field(name = "Code_Film")
	public String CodeFilm;
	
	public Double Fllows;
	
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
