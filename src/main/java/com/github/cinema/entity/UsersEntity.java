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
	public String id;
	
	@Field(name = "User_Mail")
	@NonNull
	public String Email;
	
	@Field(name = "User_Name")
	@NonNull
	public String Name;
	
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

	@Field(name = "Password")
	@NonNull
	public String password;
	
	@Field(name = "CMND")
	@NonNull
	public String CMND;
	
	@Field(name = "Number_Phone")
	@NonNull
	public Integer Phone;
	
	@Field(name = "Birth_Day")
	public LocalDate BirthDay;
	
	@Field(name = "Student")
	public Boolean Student;
	
	@Field(name = "Accumulated_Points")
	public Long Points;
	
	@Field(name = "Tickets_Coding")
	public String Ticket;

	@Field(name = "Role")
	public String role;
	
	@Transient
	public List<TicketFilm> TicketsFilm;
	
	@Transient
	public String passwordCf;
	
}
