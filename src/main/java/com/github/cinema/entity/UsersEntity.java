package com.github.cinema.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.mongodb.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersEntity {

	@Id
	private String id;
	
	@Field(name = "Role")
	private String Role;
	
	@Field(name = "User_Mail")
	@NonNull
	private String Email;
	
	@Field(name = "User_Name")
	private String Name;
	
	@Field(name = "Password")
	private String Password;
	
	@Field(name = "CMND")
	private String CMND;
	
	@Field(name = "Number_Phone")
	private Integer Phone;
	
	@Field(name = "Birth_Day")
	private LocalDate BirthDay;
	
	@Field(name = "Student")
	private Boolean Student;
	
	@Field(name = "Accumulated_Points")
	private Long Points;
	
	@Field(name = "Tickets_Coding")
	private String Ticket;
	
	@Transient
	private List<TicketFilm> TicketsFilm;
	
}
