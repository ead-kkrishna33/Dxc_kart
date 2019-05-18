package com.dxc.model;

import org.springframework.data.annotation.Id;

public class Order {

	@Id
	private String id;
	private String username;
	private String name;
	private String category;
	private String brand;
	private int price;
	
	
	public Order(String name, String category, String brand, int priceValue) {
		super();
		this.name = name;
		this.category = category;
		this.brand = brand;
		price = priceValue;
	}
	
	public Order() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int priceValue) {
		price = priceValue;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
