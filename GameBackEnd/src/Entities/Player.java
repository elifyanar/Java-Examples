package Entities;

import java.time.LocalDate;

import Abstract.Entity;

public class Player implements Entity {
	
	public int Id;
	public String FirstName;
	public String LastName;
	public String dateOfBirth;
	public String NationalityId;
	
	public Player() {}
	
	public Player(int id, String firstName, String lastName, String dateOfBirth, String nationalityId) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.dateOfBirth = dateOfBirth;
		NationalityId = nationalityId;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}
