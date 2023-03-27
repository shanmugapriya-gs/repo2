package com.day11.oops2;

public class Scale extends StationaryProduct{
	String material;
	public String findDurability(String material) {
		if(material.equalsIgnoreCase("Steel")) {
			return "Long term use";
		}
		else {
			return "Short term use";
		}
	}

}
