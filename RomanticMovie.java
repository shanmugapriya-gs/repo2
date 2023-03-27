package com.day11.oops2;

public class RomanticMovie extends Movie {
	public String findRating(int fightScence) {
		if(fightScence==2) {
			return "Good";
		}
		else if(fightScene==3) {
			return "Average";
		}
		else if(fightScene==4) {
			return "Poor";
		}
		else {
			return "Very Poor";
		}

}


}
