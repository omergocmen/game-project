package Entities;

public class Game {
	private int id;
	private String name;
	private double rating;
	private int unitPrice;
	
	public Game() {
		
	}
	
	public Game(int id, String name, double rating, int unitPrice) {
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.unitPrice = unitPrice;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
