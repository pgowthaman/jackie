package com.niit.kafonbackend.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="REGISTER")
public class Register {
	@Id
	private String userId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String phoneNumber;
	@Column
	private String EmailId;
	@Column
	private String password;
	/*@Column
	@GeneratedValue
	private int id;*/
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
/*	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
*/	

}