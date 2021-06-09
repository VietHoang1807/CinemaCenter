package com.github.cinema.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Ticket_Film")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketFilm {

	@Id
	private String Id;
	
	@Field(name= "User_Email")
	private String Email;
	
	@Field(name = "Show_Coding")
	private String Show;
	
	@Field(name = "Seat_Coding")
	private String Seat;
	
	@Field(name = "Money")
	private Double Money;
	
	@Field(name="Status")
	private String Status;
}
