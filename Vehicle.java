package com.day11.oops2;

public class Vehicle {
	String brand;
	int price;
	String color;
	public Vehicle(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
		public String toString() {
			return "Brand: " + brand + ", Price: " + price + ", Color: " + color;
		}
}
