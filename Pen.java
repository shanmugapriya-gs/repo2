package com.day11.oops2;

public class Pen extends StationaryProduct{
         boolean isInk;
         public String findRefillable(boolean isInk) {
        	 boolean a=true;
        	 if(isInk==a) {
        		 return "Refillable";
        	 }
        	 else {
        		 return "not refillable";
        		 
        	 }
         }
}
