package com.capgemini.sprint.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User1_Table")
public class User1 {
	@Id
	public int userId;
	public String firstName;
	public String middleName;
	public String email;
	public String phoneNumber;
	public String aadharCardNo;
	@OneToOne(cascade=CascadeType.ALL)
	public Login logIn;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAadharCardNo() {
		return aadharCardNo;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public Login getLogIn() {
		return logIn;
	}
	public void setLogIn(Login logIn) {
		this.logIn = logIn;
	}
	
	
	
	
	

}


