package com.day11.oops2;

public class Maximum {
	public String findMax(int a) {
		if(a>100) {
			return a+ " is maximum";
		}
		else {
			 return a+ " is not maximum";
		}
	}
	public String findMax(int a,int b) {
		if(a>b) {
			return a + " is greater than " + b;
		}
		else {
			return b+ " is greater than " + a;
		}
	}
	public String findMax(int a,int b,int c) {
		if(a>b&&a>c) {
			return a+ " is greater";
		}
		else if(b>c&&b>a) {
			return b+ " is greater";
		}
		else {
			return c + " is greater";
		}
	}
	public String findMax(String [] a) {
		int max=a.length;
		String temp=" ";
		for(String x: a) {
			if(x.length()>=max) {
				max=x.length();
				temp=x;
			}
		}
		return temp;
	}
}
		
		
		