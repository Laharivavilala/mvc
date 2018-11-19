package com.cg.ctrl;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	
	
	@NotEmpty(message="First Name is mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 characters required")
	private String firstName;
	
	@NotEmpty(message="last Name is mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 characters required")
	private String lastName;
	private char gender;
	
	@NotEmpty(message="email is mandatory")
	@Size(min=4,max=8,message="Minimum 4 and Maximum 8 characters required")
	private String email;
	private String[] skillset;
	private String city;
	
	
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String[] getSkillset() {
		return skillset;
	}
	public void setSkillset(String[] skillset) {
		this.skillset = skillset;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
