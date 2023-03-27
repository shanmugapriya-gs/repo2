package com.day11.oops2;

public class Bike {
	String brand;
	int price;
	public String findNet(int price,int tax) {
		return "NetPrice=" + (price+tax);
		
	}

}
