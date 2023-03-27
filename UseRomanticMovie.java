package com.day11.oops2;

public class UseRomanticMovie {
	public static void main(String[] args) {
		RomanticMovie r=new RomanticMovie();
		r.fightScene=4;
		System.out.println(r.findRating(r.fightScene));
	}

}
