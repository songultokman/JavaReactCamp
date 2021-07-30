package Entities;

import Abstract.Entity;

public class Player implements Entity {

	public int id;
	public String nationalityId;
	public String firstName;
	public String lastName;
	public int birthOfDate;
	
	public Player()
	{
		
	}
	public Player(int id, String nationalityId, String firstName, String lastName, int birtOfDate) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birtOfDate;
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


	public void setLastNmae(String lastNmae) {
		this.lastName = lastNmae;
	}


	public int getBirthOfDate() {
		return birthOfDate;
	}


	public void setBirthOfDate(int birtOfDate) {
		this.birthOfDate = birtOfDate;
	}
	
}