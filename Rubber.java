package com.day11.oops2;

public class Rubber extends StationaryProduct {
	String color;
	public String findVowels(String color) {
		if(color.contains("a")||color.contains("e")||color.contains("i")||color.contains("o")||color.contains("u")) {
			return "contains vowels";
		}
		else {
			return "contains no vowels";
		}
	}

}
