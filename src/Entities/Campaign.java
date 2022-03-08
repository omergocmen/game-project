package Entities;

import java.sql.Date;

public class Campaign {
	private int id;
	private String name;
	private Date beginTime;
	private Date expirationTime;
	private int discount;
	
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String name, Date beginTime, Date expirationTime, int discount) {
		this.id = id;
		this.name = name;
		this.beginTime = beginTime;
		this.expirationTime = expirationTime;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
}
