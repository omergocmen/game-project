package Entities;

import java.sql.Date;

public class Player {
	private int id;
	private String firstName;
	private String lastName;
	private Date createdAt;
	private String nationalityId;
	private Date birthOfDate;
	
	public Player() {
		
	}
	
	public Player(int id, String firstName, String lastName, Date createdAt, String nationalityId, Date birthOfDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdAt = createdAt;
		this.nationalityId = nationalityId;
		this.birthOfDate = birthOfDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Date getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	

}
