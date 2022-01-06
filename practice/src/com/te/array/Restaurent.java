package com.te.array;

import java.util.Scanner;

public class Restaurent {
	private int restaurantId;
	private String restaurantName;
	private String resType;
	private double averageBillPerPerson;
	private int rating;

	public Restaurent(int restaurantId, String restaurantName, String resType, double averageBillPerPerson, int rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.resType = resType;
		this.averageBillPerPerson = averageBillPerPerson;
		this.rating = rating;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public double getAverageBillPerPerson() {
		return averageBillPerPerson;
	}

	public void setAverageBillPerPerson(double averageBillPerPerson) {
		this.averageBillPerPerson = 50000;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
