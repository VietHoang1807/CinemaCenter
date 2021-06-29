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
	
	@Field(name = "User_Mail")
	@NonNull
	private String Email;
	
	@Field(name = "User_Name")
	@NonNull
	private String Name;
	

	@Field(name = "Password")
	@NonNull
	private String password;
	
	@Field(name = "CMND")
	@NonNull
	private String CMND;
	
	@Field(name = "Number_Phone")
	@NonNull
	private Integer Phone;
	
	@Field(name = "Birth_Day")
	private LocalDate BirthDay;
	
	@Field(name = "Student")
	private Boolean Student;
	
	@Field(name = "Accumulated_Points")
	private Long Points;
	
	@Field(name = "Tickets_Coding")
	private String Ticket;

	@Field(name = "Role")
	private String role;
	
	@Transient
	private List<TicketFilm> TicketsFilm;
	
	@Transient
	private String passwordCf;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		Phone = phone;
	}

	public LocalDate getBirthDay() {
		return BirthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		BirthDay = birthDay;
	}

	public Boolean getStudent() {
		return Student;
	}

	public void setStudent(Boolean student) {
		Student = student;
	}

	public Long getPoints() {
		return Points;
	}

	public void setPoints(Long points) {
		Points = points;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<TicketFilm> getTicketsFilm() {
		return TicketsFilm;
	}

	public void setTicketsFilm(List<TicketFilm> ticketsFilm) {
		TicketsFilm = ticketsFilm;
	}

	public String getPasswordCf() {
		return passwordCf;
	}

	public void setPasswordCf(String passwordCf) {
		this.passwordCf = passwordCf;
	}

	
}
