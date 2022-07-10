package com.capgemini.sprint.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Login_table")
public class Login {
	@Id
@NotNull(message="Id cannot be null")
private String userid;
@NotBlank(message="password incorrect ")
private String  password;
@NotBlank(message="role cannot be blank")
private String role;

public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}


