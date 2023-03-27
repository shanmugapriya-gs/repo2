package com.day11.oops2;

public class Movie {
	int fightScene;
	

	public String findRating(int fightScence) {
		if(fightScence==2) {
			return "Average";
		}
		else if(fightScene==3) {
			return "Okay";
		}
		else if(fightScene==4) {
			return "Good";
		}
		else {
			return "Super";
		}

}
}
