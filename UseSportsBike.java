package com.day11.oops2;

public class UseSportsBike {
	public static void main(String[] args) {
		SportsBike s=new SportsBike();
		s.brand="Jawa";
		s.price=1400000;
		s.enginecc=200;
		s.weight=2000.0f;
		SportsBike s1=new SportsBike();
		s1.brand="Duke";
		s1.price=1200000;
		s1.enginecc=190;
		s1.weight=1500.450f;
             System.out.println(s.findNet(s.price,3000));
	}

}
