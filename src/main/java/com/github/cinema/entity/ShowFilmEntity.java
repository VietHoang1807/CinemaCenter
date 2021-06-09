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
	
	@Field
	private Integer Fllows;
	
	@Field
	private LocalDate DayShow;

	@Field
	private LocalDate EndShow;
	
	@Field
	private String TypeFilm;
	
	@Field
	private String Descibe;
	
	@Field
	private Binary Image1;
	
	@Field
	private Binary Image2;
	
	@Field
	private Binary Image3;
	
	@Field
	private Binary Image4;
	
	@Field
	private Binary Image5;
	
	@Field
	private InputStream Video;

}
