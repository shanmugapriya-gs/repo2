package com.day11.oops2;

public class Car extends Vehicle{
	boolean isAutomatic;
	
	public Car(String brand,int price,String color,boolean isAutomatic) {
		super(brand,price,color);
		this.isAutomatic=isAutomatic;
	}
	public String toString() {
		return super.toString() + ", Is Automatic1: " + isAutomatic;
	}

}
