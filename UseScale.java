package com.day11.oops2;

public class UseScale {
	public static void main(String[] args) {
		Scale s=new Scale();
		s.brand="Natraj";
		s.price=15;
		s.material="Steel";
		System.out.println(s.findDurability(s.material));
	}

}
