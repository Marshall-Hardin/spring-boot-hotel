package com.revature.boot.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "HOTEL_ROOM")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	@NotEmpty(message = "Description can't be null or empty.")
	@Length(min = 1, max = 250)
	private String desription;
	
	@Column
	private double price;
	
	@Column
	private int occupancy;
	
	@Column
	private int beds;
	
	public Hotel() {}

	public Hotel(int id, String desription, double price, int occupancy, int beds) {
		super();
		this.id = id;
		this.desription = desription;
		this.price = price;
		this.occupancy = occupancy;
		this.beds = beds;
	}

	public Hotel(String desription, double price, int occupancy, int beds) {
		super();
		this.desription = desription;
		this.price = price;
		this.occupancy = occupancy;
		this.beds = beds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesription() {
		return desription;
	}

	public void setDesription(String desription) {
		this.desription = desription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

}
