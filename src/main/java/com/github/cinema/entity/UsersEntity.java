package com.github.cinema.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersEntity {

	@Id
	public String id;
	
	@Field(name = "User_Mail")
	public String Email;
	
	@Field(name = "User_Name")
	public String Name;
	
	@Field(name = "CMND")
	public String CMND;
	
	@Field(name = "Number_Phone")
	public Integer Phone;
	
	@Field(name = "Birth_Day")
	public LocalDate BirthDay;
	
	@Field(name = "Student")
	public Boolean Student;
	
	@Field(name = "Accumulated_Points")
	public Long Points;
	
	@Field(name = "Tickets_Coding")
	public String Ticket;
	
	@Transient
	public List<TicketFilm> TicketsFilm;
	
}
