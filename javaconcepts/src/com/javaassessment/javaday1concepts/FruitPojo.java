package com.javaassessment.javaday1concepts;

public class FruitPojo {

	private String name;
	private String color;
	private double weight;
	private double price;


	
	public FruitPojo(String name, String color, double weight, double price) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.color=color;
		this.weight=weight;
		this.price=price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
