package com.day11.oops2;

public class UsePen {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.brand="Hero";
		p.price=80;
		p.isInk=true;
		System.out.println(p.findRefillable(p.isInk));
		System.out.println("");
	}

}
