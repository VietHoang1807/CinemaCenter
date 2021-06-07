package com.github.cinema.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Ticket_Film")
public class TicketFilm {

	@Id
	public String Id;
	
	@Field(name= "User_Email")
	public String Email;
	
	@Field(name = "Show_Coding")
	public String Show;
	
	@Field(name = "Seat_Coding")
	public String Seat;
	
	@Field(name = "Money")
	public Double Money;
	
	@Field(name="Status")
	public String Status;
}