package Entities;

import Abstract.Entity;

public class Customer implements Entity {

	public int id;
	public String nationalityId;
	public String firstName;
	public String lastName;
	public int dateOfBirth;
	
	public Customer(int id, String nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
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

	public int getDateofBirth() {
		return dateOfBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		this.dateOfBirth = dateofBirth;
	}
	

}
