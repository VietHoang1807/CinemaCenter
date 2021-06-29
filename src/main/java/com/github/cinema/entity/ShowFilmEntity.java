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
	private String Id;
	
	@Field(name = "Code_Film")
	private String CodeFilm;
	
	@Field(name = "Fllows")
	private Double Fllows;
	
	@Field(name = "DayShow")
	private LocalDate DayShow;
	
	@Field(name = "EndShow")
	private LocalDate EndShow;
	
	@Field(name = "TypeFilm")
	private String TypeFilm;
	
	@Field(name = "Descibe")
	private String Descibe;
	
	@Field(name = "Image1")
	private Binary Image1;
	
	@Field(name = "Image2")
	private Binary Image2;
	
	@Field(name = "Image3")
	private Binary Image3;
	
	@Field(name = "Image4")
	private Binary Image4;
	
	@Field(name = "Image5")
	private Binary Image5;
	
	@Field(name = "Video")
	private InputStream Video;
	
	
}
